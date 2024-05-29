/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.pkg1;

import java.util.Scanner;
import static practica1.pkg1.Practica1.ejecucion;

/**
 *
 * @author jhona
 */
public class mainpractica1 {
    
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Este programa ejecuta todas las funciones programadas: puras, primer orden y segundo orden");        
        int a,b;
        System.out.println("Introduzca el valor de a");
        a=scanner.nextInt();
        System.out.println("Introduzca el valor de b");
        b=scanner.nextInt();
        
        ejecucion(a,b);
    }
}
