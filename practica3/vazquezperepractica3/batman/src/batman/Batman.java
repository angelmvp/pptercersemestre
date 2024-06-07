/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batman;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import batman.Funcionbatman;
import batman.BatmanPolimorfo;
/**
 *
 * @author jhona
 */
public class Batman {

    public static int impar(int x){
        if(x==-1){
            return -1;
        }
        if (x%2==0){
            return -1;
        }
        return x;  
    }
    public static int tresveces(int x){
        if(x==-1){
            return -1;
        }
        String xcadena= String.valueOf(x);
        int[] cadena = new int[xcadena.length()];
        for(int i=0; i<xcadena.length();i++){
            cadena[i]= xcadena.charAt(i) - '0';
        }
        if(cadena[0]!= 3*cadena[2]){
            return -1;
        }
        return x;
    }
    public static int suman27(int x){
         if(x==-1){
            return -1;
        }
         String xcadena= String.valueOf(x);
        int[] cadena = new int[xcadena.length()];
        for(int i=0; i<xcadena.length();i++){
            cadena[i]= xcadena.charAt(i) - '0';
        }
        if(IntStream.of(cadena).sum()!=27){
            return -1;
        }
        return x;
    }
    public static List<Integer> numeroscompuestosbatman(){
            Funcionbatman impar = new Funcionbatman() {
            @Override
            public int opera(int x) {
            return Batman.impar(x);
            }
        };
            Funcionbatman suman27 = new Funcionbatman() {
            @Override
            public int opera(int x) {
            return Batman.suman27(x);
            }
        };
            Funcionbatman tresveces = new Funcionbatman() {
            @Override
            public int opera(int x) {
                return Batman.tresveces(x);
            }
        };
        List<Integer> lista = new LinkedList<>();
           for(int i=1000;i<=9999;i++){
            if( componer(suman27,tresveces,impar).opera(i)!=-1){
                lista.add(i);
                }
           }
        return lista; 
    }
        public static void imprimirLista(List<Integer> lista) {
        for(int numero: lista) {
            System.out.println("Un numero donde esta el enemigo puede ser: " + numero);
            }
    }
        public static Funcionbatman componer(Funcionbatman funcionUno, 
                                    Funcionbatman funcionDos, Funcionbatman funcionTres) {
        return new Funcionbatman() {
            public int opera(int x) {
                return funcionUno.opera(funcionDos.opera(funcionTres.opera(x)));
            }
        };
    }
    
public static List<Integer> numerospolimorfosbatman() {
    
        BatmanPolimorfo<Integer, Integer> impar = new BatmanPolimorfo<Integer, Integer>() {
            @Override
            public Integer opera(Integer x) {
                return Batman.impar(x);
            }
        };
        BatmanPolimorfo<Integer, Integer> suman27 = new BatmanPolimorfo<Integer, Integer>() {
            @Override
            public Integer opera(Integer x) {
                return Batman.suman27(x);
            }
        };
        BatmanPolimorfo<Integer, Integer> tresveces = new BatmanPolimorfo<Integer, Integer>() {
            @Override
            public Integer opera(Integer x) {
                return Batman.tresveces(x);
            }
        };
        List<Integer> lista = new LinkedList<>();
        for (int i = 1000; i <= 9999; i++) {
            if (componerpolimorfo(suman27, tresveces, impar).opera(i) != -1) {
                lista.add(i);
            }
        }
        return lista;
}
    public static BatmanPolimorfo<Integer, Integer> componerpolimorfo(BatmanPolimorfo<Integer, Integer> funcionU,
            BatmanPolimorfo<Integer, Integer> funcionD, BatmanPolimorfo<Integer, Integer> funcionT) {
        return new BatmanPolimorfo<Integer, Integer>() {
            public Integer opera(Integer x) {
                return funcionU.opera(funcionD.opera(funcionT.opera(x)));
            }
        };
    }
    

                          /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
         System.out.println("PROGRAMA BATMAN 1");
        List<Integer> listacompuesta = new LinkedList<>();
        listacompuesta=numeroscompuestosbatman();
            System.out.println("imprimiendo lista generada con funciones compuestas : ");
        imprimirLista(listacompuesta);
        List<Integer> listapolimorfa = new LinkedList<>();
        
        listapolimorfa=numerospolimorfosbatman();
            System.out.println("\nimprimiendo lista generada con funciones polimorfas : ");
        imprimirLista(listapolimorfa);
    }


}
    

