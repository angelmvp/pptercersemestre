fibonacci(0, 0).
fibonacci(1, 1).
fibonacci(2, 1).

fibonacci(N, X) :-
    N > 2, %comprobar
    Y is N - 1,%generar
    Z is N - 2,%generar
    fibonacci(Y, Fi1),%generar
    fibonacci(Z, Fi2),%generar
    X is Fi1 + Fi2.

generarfibonacci(Ini, Fin) :-
    Ini =< Fin, %comprobar
    fibonacci(Ini, X), %generar
    write(X), write(', '),
    Sig is Ini + 1,
    generarfibonacci(Sig, Fin). %generar

