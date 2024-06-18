/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import juguetes.Zur;
import roles.Heroe;
import roles.Juguete;
import roles.Villano;

/**
 *
 * @author jhona
 */
public class AndrewStanton extends Actor implements Zur{
    public AndrewStanton() {
        super();
    }

    public AndrewStanton(String genero, double peso, double talla, String nombre, 
                         int edad, String idioma) {
        super(genero, peso, talla, nombre, edad, idioma);
    }
    @Override
    public void decirlaverdad(String frase) {
        System.out.println( frase );
    }

    @Override
    public void disparar() {
        System.out.println("pium pium pium pium ");
    }

    @Override
    public void jugar() {
        System.out.println("jugando con Zurg");
    }

    @Override
    public void destruir(Villano v) {
        System.out.println("destruyendo villano");
    }

    @Override
    public void destruir(Heroe h) {
        System.out.println("destruyendo heroe"  );
    }

    @Override
    public void destruir(Juguete j) {
        System.out.println("destruyendo Juguete");
    }
    
}
