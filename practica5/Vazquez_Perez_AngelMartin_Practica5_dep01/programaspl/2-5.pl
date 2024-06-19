euclidesMcd(X, 0, X) :- !.
euclidesMcd(X, Y, Resultado) :-
    Y > 0,
    Residuo is (X mod Y),
    euclidesMcd(Y, Residuo, Resultado).


