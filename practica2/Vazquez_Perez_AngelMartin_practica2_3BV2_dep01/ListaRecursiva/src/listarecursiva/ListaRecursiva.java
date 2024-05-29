/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaRecursiva;
import java.util.Scanner;/**
 *
 * @author jhona
 */
public class ListaRecursiva {

public static Nodo p = new Nodo();


    public static void crearAlInicio(String[] dato, int n) {
            p.nombre = dato[n-1];
            p.siguiente = null; 
            insertarInicio(dato,n-1);
        }
    
    public static void crearAlFinal(String[] dato, int n) {                
            p.nombre = dato[n-1];
            p.siguiente = null; 
            insertarFinal(p,dato,n-1);
        }
    public static void imprimirListarecursiva(Nodo p) { 
        if(p!=null) { 
            System.out.println( p );
            imprimirListarecursiva(p.siguiente);
            } 
    }

    public static void insertarInicio(String[] dato, int n) {
        if(n==0){
            return;
        }
        Nodo q = new Nodo(); 
        q.nombre = dato[n-1];
        q.siguiente = p;
        p = q;
        insertarInicio(dato ,n-1) ;
        }
    

public static void insertarFinal(Nodo t, String[] dato,int  n) {
    if(n==0){
        return;
    }else{
    if (t.siguiente == null) {
        Nodo q = new Nodo();
        q.nombre = dato[n-1];
        q.siguiente = null;
        t.siguiente = q;
        insertarFinal(q,dato,n-1);
    }else{
    insertarFinal(t.siguiente, dato, n); 
    }
    }
}
    public static void insertarAntesX(Nodo c,String dato, String X,Nodo a) {
        if(c==null){
            return;
        }
        if(c.nombre.equals(X) && a==null){
            String[] datos = new String[1];
            datos[0]=dato;
            insertarInicio(datos,1);
            return;
        }
        if(c.nombre.equals(X) ) {
            Nodo nuevo= new Nodo();
            nuevo.nombre=dato;
            nuevo.siguiente=c;
            a.siguiente=nuevo;
            return;
            } 
        else { 
            insertarAntesX(c.siguiente,dato,X,c); 
            }
        
            } 
    
    
    public static void insertarDespuesX(Nodo c,String dato, String X) {
        if(c.nombre.equals(X)){
            Nodo nuevo=new Nodo();
            nuevo.siguiente=c.siguiente;
            nuevo.nombre=dato;
            c.siguiente=nuevo;
        }
        else if(c.siguiente==null){
                return;
        }
        else{
            insertarDespuesX(c.siguiente, dato,X);  
        }
    } 
    
    public static Nodo eliminarInicio() {
        Nodo q = p; 
        p = q.siguiente; 
        return q;
    }
    
    public static Nodo eliminarUltimo(Nodo c,Nodo a) {
        if(c==null){
            Nodo t=null;
            return t;
        }
        if(c.siguiente==null){
            if (a==null){
                p=null;
            }else{
                a.siguiente=null;
            }
            return c;
        }
            Nodo x;
            x=eliminarUltimo(c.siguiente,c);
               return x;
    }

    public static Nodo eliminarX(Nodo c,String X,Nodo a) {
        if(c==null){
            return null;
        }
        if(c.nombre.equals(X)){
            if(a==null){
                return eliminarInicio();
            }else if(c.siguiente==null){
                return eliminarUltimo(p,null);
            }else{
                a.siguiente=c.siguiente;
                c.siguiente=null;
                return c;               
            }
        }
        else{
            Nodo Y=eliminarX(c.siguiente, X, c);
            return Y;
        }
    }

    public static Nodo eliminarAntesX(Nodo c,String X,Nodo a) {
        if(c==null){
            return null;
        }else{
        if(c.nombre.equals(X)){
            if(a==null){
                return eliminarInicio();
            }else {
                return eliminarX(p,a.nombre,null);                           
            }
        }
        else{
            Nodo Y=eliminarAntesX(c.siguiente, X, c);
            return Y;
        }
        }
    }
    
    public static Nodo buscar(Nodo c,String X) {
        if(c==null){
            return null ;
        }else{
     
            if(c.nombre.equals(X)){
                return c ;
            }
            else{
                return buscar(c.siguiente,X);
            }
           
        }
    }
    
    
  
    public static void eliminarLista() {
        if(p!=null) {
            p = null;
            }
        System.gc();
    }
    public static void mostrarNodo(Nodo x){
         if(x==null){
        return;
    }
        System.out.println("El nodo eliminado contenia "+ x.nombre);
        
    }   
         public static int tam() {
        int cont = 0;
        Nodo actual = ListaRecursiva.p;
        while (actual != null) {
            cont++;
            actual = actual.siguiente;
        }
        return cont;
    }
        public static void ordenarBurbujaRecursivo(Nodo c) {
        if (c == null || c.siguiente == null) {
            return;
        }

        if (burbuja(c)==true) {
            ordenarBurbujaRecursivo(c);
        }
    }
    public static  boolean burbuja(Nodo c) {
        boolean cambio = false;
        Nodo temp = c;
        while (temp != null && temp.siguiente != null) {
            if (temp.nombre.compareTo(temp.siguiente.nombre) > 0) {
                String tmp = temp.nombre;
                temp.nombre = temp.siguiente.nombre;
                temp.siguiente.nombre = tmp;
                cambio = true;
            }
            temp = temp.siguiente;
        }
        return cambio;
    }


}

   

