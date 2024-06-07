/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado_microondas;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jhona
 */
public class Teclado_Microondas {

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
            return Teclado_Microondas.buscarmascercanoalto(x);
            }

        };
            FuncionTeclado bajo = new FuncionTeclado() {
            @Override
            public int  opera(int x) {
            return Teclado_Microondas.buscarmascercanobajo(x);
            }
        };
            FuncionTeclado prohibido = new FuncionTeclado() {
            @Override
            public int  opera(int x) {
            return Teclado_Microondas.contieneprohibido(x);
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
    
     public static List<Integer> buscarpolimorfo(int x){

        FuncionTecladoPolimorfo<Integer, Integer> contieneprohibido = new FuncionTecladoPolimorfo<Integer, Integer>() {
            @Override
            public Integer opera(Integer x) {
                return Teclado_Microondas.contieneprohibido(x);
            }
        };

        FuncionTecladoPolimorfo<Integer, Integer> alto = new FuncionTecladoPolimorfo<Integer, Integer>() {
            @Override
            public Integer opera(Integer x) {
               return  Teclado_Microondas.buscarmascercanoalto(x);
            }

        };

        FuncionTecladoPolimorfo<Integer, Integer> bajo = new FuncionTecladoPolimorfo<Integer, Integer>() {
            @Override
            public Integer opera(Integer x) {
                return Teclado_Microondas.buscarmascercanobajo(x);
            }

        };

        List<Integer> lista = new LinkedList<>();
        lista.add(componerPolimorfo(bajo,contieneprohibido).opera(x));
        lista.add(componerPolimorfo(alto,contieneprohibido).opera(x));
        return lista;
    }

    public static FuncionTecladoPolimorfo<Integer, Integer> componerPolimorfo(
            FuncionTecladoPolimorfo<Integer, Integer> f1,
            FuncionTecladoPolimorfo<Integer, Integer> f2) {
        return new FuncionTecladoPolimorfo<Integer, Integer>() {
            @Override
            public Integer opera(Integer x) {
                return f2.opera(f1.opera(x));
            }
        };
    }   
    
    public static void main(String[] args) {
        int x;
        int sigo=1;
        Scanner teclado = new Scanner(System.in);
        while (sigo==1){
        
        System.out.println("Introduzca un numero para el microondas: ");
        x=teclado.nextInt();
        List<Integer> lista = new LinkedList<>();
        System.out.println("Con funciones Compuestas");
        lista=buscar(x);
        System.out.println("la temperatura mas baja es:-- " + lista.remove(0));
        System.out.println("la temperatura mas alta es:-- " + lista.remove(0));
        System.out.println("Con funciones Polimorficas");
        lista=buscarpolimorfo(x);
        System.out.println("la temperatura mas baja es:-- " + lista.remove(0));
        System.out.println("la temperatura mas alta es:-- " + lista.remove(0));
        
            System.out.println("Quiere introducir otro numero? \n1.-si\n0.-no");
            sigo = teclado.nextInt();
        }
        teclado.close();
        
    }
    
}
