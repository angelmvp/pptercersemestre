/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaRecursiva;

/**
 *
 * @author sauldelaotorres
 */
    public class Nodo {

        public String nombre;
        public Nodo siguiente;


        @Override
        public String toString() {
            return "Nodo{" + "nombre=" + nombre + ", siguiente=" + siguiente + '}';
        }
    }
