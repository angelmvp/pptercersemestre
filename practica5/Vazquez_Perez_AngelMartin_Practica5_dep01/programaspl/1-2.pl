
color(azul).
color(blanco).
color(verde).
mascota(perro).
mascota(pez).
mascota(gato).
bebida(cafe).
bebida(te).
bebida(agua).
pais(sueco).
pais(britanico).
pais(aleman).

relacion_casa_mascota(blanco,perro).%bc
relacion_mascota_bebida(pez,agua).%cd
relacion_pais_casa(aleman,verde).%ab
relacion_bebida_pais(cafe,sueco).%da
nohayrelacion_pais_casa(britanico,blanco).
nohayrelacion_pais_casa(sueco,azul).
norelacionact(britanico,gato).


relacioncolor(Z,X):-pais(Z),color(X),relacion_pais_casa(Z,X).
relacionpaiscasa(X,Y):-relacion_pais_casa(X,Y);
    (pais(X),color(Y),not(relacioncolor(Z,Y)),not(relacioncolor(X,W)),not(nohayrelacion_pais_casa(X,Y))).

relacionmascota(Z,X):-color(Z),mascota(X),relacion_casa_mascota(Z,X).
casamascotarelacion(X,Y):-relacion_casa_mascota(X,Y);(color(X),mascota(Y),not(relacionmascota(Z,Y)),not(relacionmascota(X,W))).

relacionbebida(Z,X):-mascota(Z),bebida(X),relacion_mascota_bebida(Z,X).
mascotabebidarelacion(X,Y):-(mascota(X),bebida(Y),not(relacionbebida(Z,Y)),not(relacionbebida(X,W)));relacion_mascota_bebida(X,Y).

relacionpais(Z,X):-bebida(Z),pais(X),relacion_bebida_pais(Z,X).
bebidapaisrelacion(X,Y):-(bebida(X),pais(Y),not(relacionpais(Z,Y)),not(relacionpais(X,W)));relacion_bebida_pais(X,Y).

mascotapaisrelacion(X,Y):-pais(X),mascota(Y),not(norelacionact(X,Y)).

humano(A,B,C,D):-pais(A),color(B),mascota(C),bebida(D),
    relacionpaiscasa(A,B),casamascotarelacion(B,C),mascotabebidarelacion(C,D),
    bebidapaisrelacion(D,A),mascotapaisrelacion(A,C).