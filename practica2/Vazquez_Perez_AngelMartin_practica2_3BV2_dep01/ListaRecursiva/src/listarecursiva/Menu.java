/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaRecursiva;

import java.util.Scanner;

/**
 *
 * @author sauldelaotorres
 */
public class Menu {
    public static void visualizarMenu() {
        System.out.println("ESTE PROGRAMA HACE TODAS LAS FUNCIONE DE FORMA RECURSIVA");
        System.out.println( "Menu  Que operacion quieres realizar\n" );
        System.out.println( "  1. Crear al inicio.");
        System.out.println( "  2. Crear al final.");
        System.out.println( "  3. Imprimir lista recursivamente.");
        System.out.println( "  4. Insertar al inicio.");
        System.out.println( "  5. Insertar al final.");
        System.out.println( "  6. Insertar antes de un nodo X.");
        System.out.println( "  7. Insertar despues de un nodo X.");
        System.out.println( "  8. Eliminar al inicio.");
        System.out.println( " 9. Eliminar ultimo.");
        System.out.println( " 10. Eliminar nodo con informacion X.");
        System.out.println( " 11. Eliminar nodo anterior con informacion X.");
        System.out.println( " 12. ordenar la lista.");
        System.out.println( " 13. Busqueda de un elemento.");
        System.out.println( " 14. Salir del programa.");
        System.out.print( " Elija una opcion ... ");
    }
    
    public static void ejecutarMenu() {
        Scanner teclado = new Scanner(System.in);
        String X = "";
        String dato = "";
        boolean sigo = true;
        while( sigo ) {
            visualizarMenu();
            int selector = Integer.parseInt(teclado.nextLine());
            switch(selector) {
                case  1:
                        int ni,ii=0;
                        System.out.println(" Introduzca la cantidad de nombres a insertar para crear la lista: ");
                         ni=teclado.nextInt();
                        teclado.nextLine();
                        String[] aingresari = new String[ni+1];
                        while(ii<ni){
                        System.out.println("Introduzca el nombre " + (ii+1));
                        aingresari[ii]=teclado.nextLine();
                        ii++;
                        }
                    ListaRecursiva.crearAlInicio(aingresari,ni);
                    break;
                case  2:
                        ni=0;ii=0;
                        System.out.println(" Introduzca la cantidad de nombres a insertar para crear la lista: ");
                         ni=teclado.nextInt();
                        teclado.nextLine();
                        String[] aingresarff = new String[ni+1];
                        while(ii<ni){
                        System.out.println("Introduzca el nombre " + (ii+1));
                        aingresarff[ii]=teclado.nextLine();
                        ii++;
                        }
                    ListaRecursiva.crearAlFinal(aingresarff,ni);
                    break;
                case  3:
                    ListaRecursiva.imprimirListarecursiva(ListaRecursiva.p);
                    break;
                case  4:
                        int n,i=0;
                        System.out.println("Introduzca la cantidad de nombres a insertar");
                        n=teclado.nextInt();
                        teclado.nextLine();
                        String[] aingresar = new String[n+1];
                        while(i<n){
                            System.out.println("Introduzca el nombre " + (i+1));
                            aingresar[i]=teclado.nextLine();
                            i++;
                        }

                    ListaRecursiva.insertarInicio(aingresar,n);
                    break;
                case  5:
                        int nf,j=0;
                        System.out.println("Introduzca la cantidad de nombres a insertar");
                        nf=teclado.nextInt();
                        teclado.nextLine();
                        String[] aingresarf = new String[nf+1];
                        while(j<nf){
                            System.out.println("Introduzca el nombre " + (j+1));
                            aingresarf[j]=teclado.nextLine();
                            j++;
                        }

                    ListaRecursiva.insertarFinal(ListaRecursiva.p,aingresarf,nf);
                    break;
                case  6:
                    System.out.print("Introduzca el nombre a insertar : ");
                    dato = teclado.nextLine();
                    System.out.print("Nombre del nodo buscado X: ");
                    X = teclado.nextLine();
                           
                    ListaRecursiva.insertarAntesX(ListaRecursiva.p,dato,X,null);
                    break;
                case  7:
                    System.out.print("Introduzca el nombre a insertar : ");
                    dato = teclado.nextLine();
                    System.out.print("Nombre del nodo buscado X: ");
                    X = teclado.nextLine();
                    ListaRecursiva.insertarDespuesX(ListaRecursiva.p,dato,X);
                    break;
                case  8:
                    Nodo q = ListaRecursiva.eliminarInicio();
                    ListaRecursiva.mostrarNodo(q);
                    q = null;
                    System.gc();
                    break;
                case 9: 
                    Nodo p = ListaRecursiva.eliminarUltimo(ListaRecursiva.p,null);
                    ListaRecursiva.mostrarNodo(p);
                    p = null;
                    System.gc();
                    break;
                case 10:
                    System.out.print("Nombre del nodo a eliminar X: ");
                    X = teclado.nextLine();
                    Nodo Y=ListaRecursiva.eliminarX(ListaRecursiva.p,X,null);
                    ListaRecursiva.mostrarNodo(Y);
                    break;
                case 11:
                    System.out.print("Nombre del nodo a eliminar antes de X: ");
                    X = teclado.nextLine();
                    Nodo Z;
                    Z= ListaRecursiva.eliminarAntesX(ListaRecursiva.p,X,null);
                    ListaRecursiva.mostrarNodo(Z);
                    break;
                case 12:
                    ListaRecursiva.ordenarBurbujaRecursivo(ListaRecursiva.p);
                    break;
                case 13:
                    System.out.print("Nombre del nodo a buscar X: ");
                    X = teclado.nextLine();
                    Nodo t =ListaRecursiva.buscar(ListaRecursiva.p,X);
                    ListaRecursiva.imprimirListarecursiva(t);
                    break;
                case 14:
                    sigo= false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                }
            }
        ListaRecursiva.eliminarLista();
    }
        public static void main(String[] args) {
        ejecutarMenu();
    }
}
