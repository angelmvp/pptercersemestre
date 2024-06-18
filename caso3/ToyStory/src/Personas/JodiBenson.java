/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import juguetes.Barbie;

/**
 *
 * @author jhona
 */
public class JodiBenson extends Actor implements Barbie{
    public JodiBenson() {
        super();
    }

    public JodiBenson(String genero, double peso, double talla, String nombre, 
                      int edad, String idioma) {
        super(genero, peso, talla, nombre, edad, idioma);
    }
    @Override
    public void modelar() {
        System.out.println("modelando, soy la mejor");
    }

    @Override
    public void jugar() {
        System.out.println("jugando con Barbie");
    }
    
}
