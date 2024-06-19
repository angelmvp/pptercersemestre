
entrada(sopa_de_verduras,1800).
entrada(arroz,2800).
entrada(sopa_de_tornillo,3200).
entrada(crema_de_zanahoria,6000).
plato_fuerte(pechuga_asada,4000).
plato_fuerte(chilaquiles,7500).
plato_fuerte(chuleta_de_cerdo,5000).
plato_fuerte(lasagna,12000).
postre(roles_de_canela,5000).
postre(pure_de_manzana,1500).
postre(crepa,4500).
postre(concha_rellena,7500).


menulight(Entrada, Plato, Postre) :-entrada(Entrada, N),plato_fuerte(Plato, M),postre(Postre, J),
    menoscalorias(N, M, J), %comprobar
    SumaCalorias is N + M + J, %generar
    write('Menu Light:'), nl,
    write('Entrada: '), write(Entrada),write(' : '),write(N), nl,
    write('Plato Fuerte: '), write(Plato),write(' : '),write(M), nl,
    write('Postre: '), write(Postre),write(' : '),write(J), nl,
    write('Total de calorias: '), write(SumaCalorias), nl.

menumedio(Entrada, Plato, Postre) :-entrada(Entrada, N),plato_fuerte(Plato, M),postre(Postre, J),
    mediacalorias(N, M, J), %comprobar
    SumaCalorias is N + M + J,%generar
    write('Menu Medio:'), nl,
    write('Entrada: '), write(Entrada),write(' : '),write(N), nl,
    write('Plato Fuerte: '), write(Plato),write(' : '),write(M), nl,
    write('Postre: '), write(Postre),write(' : '),write(J), nl,
    write('Total de calorias: '), write(SumaCalorias), nl.

menugloton(Entrada, Plato, Postre) :-entrada(Entrada, N),plato_fuerte(Plato, M),postre(Postre, J),
    muchascalorias(N, M, J), %comprobar
    SumaCalorias is N + M + J,%generar
    write('Menu Gloton:'), nl,
    write('Entrada: '), write(Entrada),write(' : '),write(N), nl,
    write('Plato Fuerte: '), write(Plato),write(' : '),write(M), nl,
    write('Postre: '), write(Postre),write(' : '),write(J), nl,
    write('Total de calorias: '), write(SumaCalorias), nl.


menoscalorias(X,Y,Z):- 10000> (X+Y+Z). %comprobar
mediacalorias(X,Y,Z):- 10000< (X+Y+Z) , (X+Y+Z) < 20000. %comprobar
muchascalorias(X,Y,Z):- 20000< (X+Y+Z). %comprobar  