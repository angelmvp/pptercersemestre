/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import juguetes.Ham;

/**
 *
 * @author jhona
 */
public class JohnRatzenberger extends Actor implements Ham{
    public JohnRatzenberger() {
        super();
    }

    public JohnRatzenberger(String genero, double peso, double talla, String nombre, 
                            int edad, String idioma) {
        super(genero, peso, talla, nombre, edad, idioma);
    }
    @Override
    public void cambiarCanal() {
        System.out.println("dejamelo a mi, yo le cambio el canal");
    }

    @Override
    public void jugarVideojuegos() {
        System.out.println("dale al de la derecha, con el boton rojo");
    }

    @Override
    public void conducir() {
        System.out.println("hola chiquibabis manejando ando");
    }

    @Override
    public void guardar() {
        System.out.println("guardando en la alcancia");
    }

    @Override
    public void robar() {
        System.out.println("denme todo su dinero");
    }
    
}
