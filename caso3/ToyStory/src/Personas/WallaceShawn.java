/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import juguetes.Rex;
import roles.Villano;

/**
 *
 * @author jhona
 */
public class WallaceShawn extends Actor implements Rex {
   public WallaceShawn() {
        super();
    }

    public WallaceShawn(String genero, double peso, double talla, String nombre, 
                            int edad, String idioma) {
        super(genero, peso, talla, nombre, edad, idioma);
    }
    @Override
    public void vencer(Villano v) {
        System.out.println("Te estoy venciendo wos ");
    }

    @Override
    public void jugarVideojuegos() {
        System.out.println("Dale al de la derecha, con el control rojo");
    }

    @Override
    public void jugar() {
        System.out.println("REX jugando JAJAJA");
    }

    @Override
    public void rugir() {
        System.out.println("Dinosaurio ruaaaa");
    }
    
}
