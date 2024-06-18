/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import juguetes.*;
import roles.Heroe;
import roles.Villano;

/**
 *
 * @author jhona
 */
public class TimAllen extends Actor implements BuzzLightyear {
    public TimAllen() {
        super();
    }

    public TimAllen(String genero, double peso, double talla, String nombre, 
                    int edad, String idioma) {
        super(genero, peso, talla, nombre, edad, idioma);
    }
    @Override
    public void dispararLaser() {
        System.out.println("pium pium pium");
    }

    @Override
    public void viajarAlEspacio() {
        System.out.println("Al infinito y mas alla");
    }

    @Override
    public void jugar() {
        System.out.println("Buzz Jugando JAJAJA");
    }

    @Override
    public void salvar(Heroe h) {
        System.out.println("te estoy salvando mi heroe ");
    }

    @Override
    public void salvar(Villano v) {
        System.out.println("te estoy salvando villano");
    }

    @Override
    public String personaje() {
        return "Buzz Lightyear";
    }
    
}
