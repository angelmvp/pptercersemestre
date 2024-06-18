/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import juguetes.SrPapa;

/**
 *
 * @author jhona
 */
public class DonRickles extends Actor implements  SrPapa{
 public DonRickles() {
        super();
    }

    public DonRickles(String genero, double peso, double talla, String nombre, 
                      int edad, String idioma) {
        super(genero, peso, talla, nombre, edad, idioma);
    }
    @Override
    public void desarmar() {
        System.out.println("ay mi ojo, donde esta mi nariz");
    }

    @Override
    public void crecer() {
        System.out.println("Creciendoooooo");
    }

    @Override
    public void marchitar() {
        System.out.println("Marchitandoooo");
    }

    @Override
    public void romper() {
        System.out.println("crack, crack, crack");
    }
    
}
