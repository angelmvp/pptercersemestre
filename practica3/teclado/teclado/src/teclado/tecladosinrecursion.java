/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jhona
 */
public class tecladosinrecursion {

    /**
     * @param args the command line arguments
     */
    
        public static int contieneprohibido(int x){
        String xcadena = String.valueOf(x);
        for (int i = 0; i < xcadena.length(); i++) {
        char numero = xcadena.charAt(i);
        if (numero == '1' || numero == '4' || numero == '7') {
            return -1; 
        }
            }
        return x ;
        }
        public static int buscarmascercanobajo(int x){
            if(contieneprohibido(x)==-1){
                return buscarmascercanobajo(x-1);
            }
            return x;
        }
        public static int buscarmascercanoalto(int x){
            if(contieneprohibido(x)==-1){
                return buscarmascercanoalto(x+1);
            }
            return x;
        }
public static List<Integer> buscar(int x){
            FuncionTeclado alto = new FuncionTeclado() {
            @Override
            public int opera(int x) {
            return Teclado.buscarmascercanoalto(x);
            }

        };
            FuncionTeclado bajo = new FuncionTeclado() {
            @Override
            public int  opera(int x) {
            return Teclado.buscarmascercanobajo(x);
            }
        };
            FuncionTeclado prohibido = new FuncionTeclado() {
            @Override
            public int  opera(int x) {
            return Teclado.contieneprohibido(x);
            }
        };
            
        List<Integer> lista = new LinkedList<>();
            lista.add(componerbajo(bajo,prohibido).opera(x));
            lista.add(componeralto(alto,prohibido).opera(x));
        return lista; 
    }
        public static FuncionTeclado componerbajo(FuncionTeclado f1,FuncionTeclado f2){
            return new FuncionTeclado(){
                public int opera(int x){
                    return f2.opera(f1.opera(x));
                }
            };
        }
        public static FuncionTeclado componeralto(FuncionTeclado f1,FuncionTeclado f2){
            return new FuncionTeclado(){
                public int opera(int x){
                    return f2.opera(f1.opera(x));
                }
            };
        }
    
    public static void main(String[] args) {
        int x=550;
        List<Integer> lista = new LinkedList<>();
        lista=buscar(x);
        System.out.println("la temperatura mas baja es " + lista.remove(0));
        System.out.println("la temperatura mas alta es " + lista.remove(0));
    }
    
}
