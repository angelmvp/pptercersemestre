par(X):- 0 =:=  X mod 2 .
impar(X):- 1 =:= X mod 2 .
suma(X,Y,Z):- X + Y =:= Z.
resta(Z,X,Y):- Y =:= Z - X .
mayor(X,Y):- X > Y.
menor(X,Y):- X=<Y.

pares_suma_caso1(Z,X,Y):- par(X),	   %generar
		par(Y),	                    %generar
		suma(X,Y,Z).	            %comprobar


pares_suma_caso2(Z,X,Y):-menor(X,Z), %comprobar
		menor(Y,Z),	       %comprobar
		suma(X,Y,Z),	    %comprobar
		par(X),	            %comprobar
		par(Y).	            %comprobar

pares_suma_caso3(Z,X,Y):-menor(X,Z),  %comprobar
		par(X),	            %comprobar
		suma(X,Y,Z),	    %generar
		par(Y).	            %comprobar

    
pares_suma_caso4(Z,X,Y):-suma(X,Y,Z),%generar
                    par(X),         %comprobar
                    par(Y).         %comprobar


pares_suma_caso5(Z,X,Y):- par(Z),%comprobar
                    suma(X,Y,Z),  %generar                  
                    par(X).         %comprobar


pares_suma_caso6(Z,X,Y):-resta(Z,X,Y), %generar
                    par(Z),             %comprobar            
                    par(X).             %comprobar


pares_suma_caso7(Z,X,Y):- not(impar(Z)),  %comprobar
                    suma(X,Y,Z),             %generar                 
                    not(impar(X)).        %comprobar


pares_suma_caso8(Z,X,Y):- not(menor(Z,Y)), %comprobar
                    par(Y),               %comprobar
                    not(impar(X)),        %comprobar  
                    suma(X,Y,Z).             %generar


pares_suma_caso9(Z,X,Y):- mayor(Z,Y),        %comprobar
                    resta(Z,X,Y),           %generar
                    not(impar(X)),        %comprobar
                    par(Y).                   %comprobar


pares_suma_caso10(Z,X,Y):- menor(X,Z),%comprobar
                    suma(X,Y,Z),     %generar
                    par(X),       %comprobar
                    par(Y),       %comprobar
                    resta(Z,X,Y).    %generar