/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import juguetes.Slinky;

/**
 *
 * @author jhona
 */
public class JimVarney extends Actor implements Slinky {
    public JimVarney() {
        super();
    }

    public JimVarney(String genero, double peso, double talla, String nombre, 
                     int edad, String idioma) {
        super(genero, peso, talla, nombre, edad, idioma);
    }
    @Override
    public void estirarse() {
        System.out.println("Slinky estirandose...");
    }

    @Override
    public void jugar() {
        System.out.println("Jugando con Slinly JAJAJA");
    }

    @Override
    public void ladrar() {
        System.out.println("RAf RAf RAf");
    }
    
}
