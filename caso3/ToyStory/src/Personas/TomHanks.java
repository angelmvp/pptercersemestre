/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import SerHumano.Persona;
import juguetes.Woody;
import roles.Caballo;
import roles.Heroe;
import roles.Villano;

/**
 *
 * @author jhona
 */
public class TomHanks extends Actor implements Woody{
    public TomHanks() {
        super();
    }

    public TomHanks(String genero, double peso, double talla, String nombre, 
                    int edad, String idioma) {
        super(genero, peso, talla, nombre, edad, idioma);
    }
    @Override
    public void chistar() {
        System.out.println("Hay una serpiente en mi bota");
    }

    @Override
    public void jugar() {
        System.out.println("WOODY JUGANDO JAJAJA");
    }

    @Override
    public void protegerPueblo() {
        System.out.println("Alejate de mi pueblo");
    }

    @Override
    public void apoyar() {
        System.out.println("Animo, todo estara bien");
    }

    @Override
    public void impartirLey() {
        System.out.println("Aqui el que manda soy yo");
    }

    @Override
    public void montar(Caballo c) {
        System.out.println("Yija, dale caballo");
    }


    
}
