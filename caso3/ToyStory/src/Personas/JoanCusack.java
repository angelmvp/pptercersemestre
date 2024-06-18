/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import juguetes.Jessie;
import roles.Caballo;

/**
 *
 * @author jhona
 */
public class JoanCusack extends Actor implements Jessie {
    public JoanCusack() {
        super();
    }

    public JoanCusack(String genero, double peso, double talla, String nombre, 
                      int edad, String idioma) {
        super(genero, peso, talla, nombre, edad, idioma);
    }
    @Override
    public void cantar() {
        System.out.println("Cuando me amooo....");
    }

    @Override
    public void jugar() {
        System.out.println("jugando con Jessie JAJAJA");
    }

    public void montar() {
        System.out.println("Yija, cabalgando, dale caballlo");
    }

    @Override
    public void protegerPueblo() {
        System.out.println("yo protegere a el pueblo sin importar lo que me pase a mi");
    }

    @Override
    public void montar(Caballo c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
