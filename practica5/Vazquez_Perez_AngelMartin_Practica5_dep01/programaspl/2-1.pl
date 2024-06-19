factorial(0, 1). % Caso base

factorial(X, Facto) :-
    Y is X-1,
    factorial(Y,Factorialdelfactorial),
    Facto is X * Factorialdelfactorial.

