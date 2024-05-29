%VazquezPerzAngelMartin
%Grupo3BV2


%Ejercicio1
hombre(bertram).
hombre(percival).
mujer(lucinda).
mujer(camila).
pareja(X,Y) :- hombre(X),mujer(Y).



%?- pareja(percival, X).        --X=lucinda     X= camila
%?- pareja(apollo, daphne).     -- FALSE
%?- pareja(camila, X).          --FALSE
%?- pareja(X, lucinda).         --X=bertram; X=percival
%?- pareja(X, X).               -- FALSE
%?- pareja(bertram, lucinda).   -- TRUE 
%?- pareja(X, fido).            -- FALSE
%?- pareja(X, Y). -- X=bertram- Y=lucinda ; X= bertram- Y= camila ; X=percival-Y=lucinda ; X=percival-Y=camila.

%Ejercicio2
bebe(john, martini).
bebe(mary, ginebra).
bebe(susan, vodka).
bebe(john, ginebra).
bebe(fred, ginebra).
nosermismo(X,Y):- not(X = Y).
par(X, Y, Z) :- bebe(X, Z), bebe(Y, Z), nosermismo(X,Y).

%?- par(X, john, martini).      -- FALSE
%?- par(mary, susan, ginebra).  --  FALSE
%?- par(john, mary, ginebra).   -- TRUE 
%?- par(john, john, ginebra).   --  TRUE
%?- par(X, Y, ginebra).         --  , mary-jhon,mary-fred,john-mary,,jhon-fred,fred-mary,fred-jhon,
%?- pareja(bertram, lucinda, vodka).       -- ERROR,no esta definido
%?- pareja(X, Y, Z).            --  ERROR, NO ESTA DEFINIDO

%Ejercicio3
mago(ron).
bruja(ron).
tienevarita(harry).
jugadordequidditch(harry).
tieneescoba(X) :- jugadordequidditch(X).
bruja(hermione).
asistente(dobby).
mago(X):- (tieneescoba(X), tienevarita(X) ) ;bruja(X).

%antes de cambios
%?- mago(ron). --TRUE
%?- bruja(ron). --FALSE
%?- mago(hermione). --FALSE
%?- bruja(hermione). --FALSE
%?- mago(harry). --TRUE
%?- asistente(Y). --ERROR, NO DEFINIDO
%?- bruja(Y). --ERROR
%


%despuesdecambios
%?- mago(ron). --TRUE
%?- bruja(ron). --TRUE
%?- mago(hermione). --TRUE
%?- bruja(hermione). --TRUE
%?- mago(harry). --TRUE
%?- asistente(Y). -- Y=dobby
%?- bruja(Y). -- y=ron; y=hermione 


%Ejercicio4
elfodomestico(dobby). 
bruja(hermione). 
bruja('McGonagall'). 
bruja(ritaskeeter). 
magia(X) :- elfodomestico(X). 
magia(X) :- bruja(X). 



%?- magia(house_elf). --FALSE
%?- mago(harry). -- FALSE
%?- magia(mago). --FALSE
%?- magia('McGonagall'). --TRUE
%?- magia(Hermione). -- Hermione= hermione;Hermione= 'McGonagall';ritaskeeter;



%Ejercicio5
palabra(articulo, una).
palabra(articulo, cada).
palabra(sustantivo, criminal).
palabra(sustantivo, gran_hamburguesa_kahuna).
palabra(verbo, comer).
palabra(verbo, gustar).
oracion(Palabra1, Palabra2, Palabra3, Palabra4, Palabra5) :-
palabra(articulo,Palabra1),
palabra(sustantivo, Palabra2),
palabra(verbo, Palabra3),
palabra(articulo,Palabra4),
palabra(sustantivo, Palabra5),

%seria 2 elevada a 5 que son 32 posibles combinaciones, como los numeros binarios, solo tenemos 2 posibles valores de cada tipo de palabra, 


%	una criminal comer una criminal
%	una criminal comer una gran_hamburguesa_kahuna
%	una criminal comer cada criminal
%	una criminal comer cada gran_hamburguesa_kahuna
%	una criminal gustar una criminal
%	una criminal gustar una gran_hamburguesa_kahuna
%	una criminal gustar cada criminal
%	una criminal gustar cada gran_hamburguesa_kahuna
%	una gran_hamburguesa_kahuna comer una crimina
%	una gran_hamburguesa_kahuna comer una gran_hamburguesa_kahuna
%	una gran_hamburguesa_kahuna comer cada criminal
%	una gran_hamburguesa_kahuna comer cada gran_hamburguesa_kahuna
%	una gran_hamburguesa_kahuna gustar una criminal
%	una gran_hamburguesa_kahuna gustar una gran_hamburguesa_kahuna
%	una gran_hamburguesa_kahuna gustar cada criminal
%	una gran_hamburguesa_kahuna gustar cada gran_hamburguesa_kahuna
%	cada criminal comer una criminal
%	cada criminal comer una gran_hamburguesa_kahuna
%	cada criminal comer cada criminal
%	cada criminal comer cada gran_hamburguesa_kahuna
%	cada criminal gustar una criminal
%	cada criminal gustar una gran_hamburguesa_kahuna
%	cada criminal gustar cada criminal
%	cada criminal gustar cada gran_hamburguesa_kahuna
%	cada gran_hamburguesa_kahuna comer una criminal
%	cada gran_hamburguesa_kahuna comer una gran_hamburguesa_kahuna
%	cada gran_hamburguesa_kahuna comer cada criminal
%	cada gran_hamburguesa_kahuna comer cada gran_hamburguesa_kahuna
%	cada gran_hamburguesa_kahuna gustar una criminal
%	cada gran_hamburguesa_kahuna gustar una gran_hamburguesa_kahuna
%	cada gran_hamburguesa_kahuna gustar cada criminal
%	cada gran_hamburguesa_kahuna gustar cada gran_hamburguesa_kahuna
