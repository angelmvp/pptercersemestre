/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.pkg1;

/**
 *
 * @author jhona
 */

public class Practica1 {

    /**
     * @param args the command line arguments
     */
    
    public static int sumapura(int x,int y){ //λx.λy. x + y
        return x+y;
    }
    public static int restapura(int x,int y){//λx.λy. x - y
        return x-y;
    }
    public static int multiplicacionpura(int x,int y){ //λx.λy. x * y
        return x*y;
    }
    public static int divisionpura(int x,int y){ //λx.λy. x * y
        if(y==0 && x>0){
            return Integer.MAX_VALUE;
        }   
        else if(y==0 && x<0){
            return Integer.MIN_VALUE;
        }
        return x/y;
    }
    
    public static int modulopuro(int x,int y){ //λx.λy. x % y
        if (y==0){
            return x;
        }
        return x%y;
    }
     
    public static int sumarecursiva(int x,int y){ // = (λx.λy.(if (= x 0) y || (if (= y 0)x(sumarecursiva(- x 1),(+ y 1)))))
        if(x==0){
            return y;
        }
        if(y==0){
            return x;
        }
        return sumarecursiva(x-1,y+1);
    }
    public static int restarecursiva(int x,int y){//= (λx.λy.(if (= y 0)x (restarecursiva(- x 1),(- y 1)))))
        if (y==0){
            return x;
        }
        return restarecursiva(x-1,y-1);
    }
    
    public static int multiplicacionrecursiva(int x,int y){//= (λx.λy.(if (= y 0)0  (+ (multiplicacionrecursiva(x,(- y 1)))))
        if(y==0){
            return 0;
        }
        return x +multiplicacionrecursiva(x,y-1);
    }
    
    public static int divisionrecursiva(int x, int y) {// λx.λy. if (x < y) 0 
                                                        //else if (x == y) 1 else 1 + divisionrecursiva(x - y, y)
         if(y==0 && x>0){
            return Integer.MAX_VALUE;
        }   
        else if(y==0 && x<0){
            return Integer.MIN_VALUE;
        }
            if (x<y){
                return 0;
            }
            if (x==y){
                return 1;
            }
            else
                return 1+divisionrecursiva(x - y, y);
        }
    
    public static int modulorecursivo(int x,int y){// λx.λy. if (y == 0) x else if (x < y) x else modulorecursivo(x - y, y)
        if(y==0){
            return x;
        }
        if (x<y){
            return x;
        }
        return modulorecursivo(x-y,y);
    }        
    
    
    
       
    public static int sumasegundo(int x,int y){// λx.λy. if (x == 0) y else 
                                               //sumarecursiva(restarecursiva(x, 1), sumarecursiva(y, 1))
        if(x==0){
            return y;
        }
        return sumarecursiva(restarecursiva(x,1),sumarecursiva(y,1));
    }
    public static int restasegundo(int x,int y){// λx.λy. if (y == 0) x else 
                                                //restarecursiva(restarecursiva(x, 1), restarecursiva(y, 1))
        if (y==0){
            return x;
        }
        return restarecursiva(restarecursiva(x,1),restarecursiva(y,1));
    }
    
    public static int multiplicacionsegundo(int x,int y){// λx.λy. if (y == 0) 0
                                                        //else sumarecursiva(x, multiplicacionrecursiva(x, restarecursiva(y, 1)))
        if(y==0){
            return 0;
        }
        return sumarecursiva(x,multiplicacionrecursiva(x,restarecursiva(y,1)));
    }
    
    public static int divisionsegundo(int x, int y) {// λx.λy. if (x < y) 0 else if (x == y) 1 
                                                     //else sumarecursiva(1, divisionrecursiva(restarecursiva(x, y), y))
            if (x<y){
                return 0;
            }
            if (x==y){
                return 1;
            }
            else
                return sumarecursiva(1,divisionrecursiva(restarecursiva(x,y), y));
        }
    
    public static int modulosegundo(int x,int y){// λx.λy. if (x < y) x 
                                                 //else modulorecursivo(restarecursiva(x, y), y)
        if (x<y){
            return x;
        }
        return modulorecursivo(restarecursiva(x,y),y);
    } 
public static void ejecucion(int a,int b) {
        Puras puro = new Puras() {};
        
        System.out.println("METODO PURO");
        int suma = puro.sumar(a, b);
        int resta = puro.restar(a, b);
        int multiplicacion = puro.multiplicar(a, b);
        int division = puro.dividir(a, b);
        int modulo = puro.modulo(a, b);
        System.out.println("el numero a es " + a + " y el b es "+b);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
        
        System.out.println("\nMETODO PRIMER ORDEN");
        
        ordenuno prime=new ordenuno(){};
         suma = prime.sumar(a, b);
         resta = prime.restar(a, b);
         multiplicacion = prime.multiplicar(a, b);
         division = prime.dividir(a, b);
         modulo = prime.modulo(a, b);
        System.out.println("el numero a es " + a + " y el b es "+b);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
        
        
         System.out.println("\nMETODO SEGUNDO ORDEN");
        
        ordendos segundo=new ordendos(){};
         suma = segundo.sumar(a, b);
         resta = segundo.restar(a, b);
         multiplicacion = segundo.multiplicar(a, b);
         division = segundo.dividir(a, b);
         modulo = segundo.modulo(a, b);
        System.out.println("el numero a es " + a + " y el b es "+b);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
    }
    
}


