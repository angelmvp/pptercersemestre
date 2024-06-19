vendedor(120,paulo,d1).
vendedor(239,virginia,d3).
vendedor(321,maria,d5).
vendedor(430,mauricio,d2).
vendedor(532,patricia,d4).
departamento(d1,computo).
departamento(d2,ropadama).
departamento(d3,telefonia).
departamento(d4,audio).
departamento(d5,television).
producto(102,'TV sharp 65 pulgadas',12000,d5).
producto(104, 'Top Verde varias tallas', 235, d2).
producto(110, 'Vestido de Gala Negro', 1500, d2).
producto(112, 'Laptop Dell 511', 11234, d1).
producto(113, 'PC Armada Gamer', 33000, d1).
producto(120, 'Celular LG 1296', 4500, d3).
producto(121, 'iPhone 123', 12000, d3).
producto(122, 'Amplificador Denon 1x23', 17000, d4).
producto(125, 'Jeans Ajustables', 570, d2).
producto(128, 'Guitarra Eléctrica', 4589, d4).
producto(130, 'Bajo Electrico 4 Cuerdas', 6503, d4).
producto(134, 'TV Sony 75 Pulgadas Android', 26700, d5).
producto(137, 'Celular Huawei 64M', 12000, d5).
vendio(102, 36000.0).
vendio(125, 21090.0).
vendio(137, 60000.0).
vendio(130, 19509.0).
vendio(122, 68000.0).
vendio(121, 60000.0).
vendio(110, 55500.0).
vendio(104, 16685.0).
vendio(112, 78638.0).
vendio(113, 99000.0).
vendio(120, 36000.0).
vendio(134, 53400.0).
vendio(128, 13767.0).

tienetres(d1,112,113).
tiene(d2,104,110,125).
tienetres(d3,120,121).
tiene(d4,130,128,122).
tiene(d5,102,134,137).

cualesmas(Dep,X,Y,Z,W,M,Maximo):- 
    max_list([X,Y,Z,W,M], Maximo),
        (
        (Maximo = X, Dep = d1);
        (Maximo = Y, Dep = d2);
        (Maximo = Z, Dep = d3);
        (Maximo = W, Dep = d4);
        (Maximo = M, Dep = d5)).

departamentomasvendio(Dep):- 
    tienetres(d1,A,B),  vendio(A,AP),vendio(B,BP), D1 is AP+BP,
    tiene(d2,C,D,E),vendio(C,CP),vendio(D,DP),vendio(E,EP), D2 is CP+DP+EP,
    tienetres(d3,F,G), vendio(F,FP),vendio(G,GP),  D3 is FP+GP,
    tiene(d4,H,I,J),vendio(H,HP),vendio(I,IP), vendio(J,JP), D4 is HP+IP+JP,
    tiene(d5,K,L,M), vendio(K,KP),vendio(L,LP),vendio(M,MP), D5 is KP+LP+MP,
    cualesmas(Dep,D1,D2,D3,D4,D5,Maximo),
    write('el departamento '), write(Dep), write(' vendio esta cantidad'),write(Maximo).

cantidadvproducto(Codigo, Cantidad) :-
    producto(Codigo, _, Precio, _),
    vendio(Codigo, Total),
    Cantidad is Total / Precio,
    write('el producto '), write(Codigo),write(' vendio '),write(Cantidad),write(' productos').

vendedordelmes(Vendedor):-
    tienetres(d1,A,B),  vendio(A,AP),vendio(B,BP), D1 is AP+BP,
    tiene(d2,C,D,E),vendio(C,CP),vendio(D,DP),vendio(E,EP), D2 is CP+DP+EP,
    tienetres(d3,F,G), vendio(F,FP),vendio(G,GP),  D3 is FP+GP,
    tiene(d4,H,I,J),vendio(H,HP),vendio(I,IP), vendio(J,JP), D4 is HP+IP+JP,
    tiene(d5,K,L,M), vendio(K,KP),vendio(L,LP),vendio(M,MP), D5 is KP+LP+MP,
    cualesmas(Dep,D1,D2,D3,D4,D5,Maximo),
    vendedor(_,Vendedor,Dep),
    write('el vendedor del mes es '), write(Vendedor), write(' vendio esta cantidad'),write(Maximo).


    comision(Vendedor, ComisionTotal) :-
    vendedor(_, Vendedor, Dep),
    departamento(Dep, _),
    comision_aux(Dep, ComisionTotal).

    comision_aux(Dep, ComisionTotal) :-
    tienetres(Dep, A, B),
    comision_producto(A, ComA),
    comision_producto(B, ComB),
    ComisionTotal is ComA + ComB.
    
    comision_aux(Dep, ComisionTotal) :-
    tiene(Dep, A, B, C),
    comision_producto(A, ComA),
    comision_producto(B, ComB),
    comision_producto(C, ComC),
    ComisionTotal is ComA + ComB + ComC.

    comision_producto(Codigo, Comision) :-
    producto(Codigo, _, Precio, _),
    vendio(Codigo, Total),
    Comision is (Total / Precio) * (Precio * 0.03).

    imprimir_comisiones :-
    vendedor(Codigo, Nombre, _),
    comision(Nombre, ComisionTotal),
    write('El vendedor '), write(Nombre), write(' se llevo de comision: '), write(ComisionTotal), nl.





     






