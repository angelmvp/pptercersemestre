/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import juguetes.Lotso;

/**
 *
 * @author jhona
 */
public class NedBeatty extends Actor implements Lotso {
    public NedBeatty() {
        super();
    }

    public NedBeatty(String genero, double peso, double talla, String nombre, 
                     int edad, String idioma) {
        super(genero, peso, talla, nombre, edad, idioma);
    }
        
    @Override
    public void mandar() {
        System.out.println("Hazme caso soy tu jefe");
    }

    @Override
    public void comerMiel() {
        System.out.println("ñam ñam miel miel");
    }

    @Override
    public void olerRico() {
        System.out.println("huelo rico rico");
    }
    
}
