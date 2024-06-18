/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import SerHumano.Persona;
import java.util.Objects;

/**
 *
 * @author jhona
 */
public class Actor extends Persona{
    private String idioma;
    public Actor() {
        super();
        idioma = "";
    }
    public Actor(String genero, double peso, double talla, String nombre, 
            int edad, String idioma) {
        super(genero, peso, talla,nombre,edad);
        this.idioma = idioma;
    }
    public Actor(Actor alguien) {
        super(alguien);
        idioma = alguien.idioma;

    }
    @Override
    public void destruir() {
        super.destruir();
        if(idioma!=null) {
            idioma = null;
            }
        System.gc();
    }
    public void setActor(String genero, double peso, double talla, String nombre, 
            int edad ,String idioma) {
        setSerHumano(genero, peso, talla);
        this.idioma = nombre;
    }
    public void respirar(String o) {
        respirar();
    }
    public void comer() {
        System.out.println("Comiendo nam, nam, nam");
    }
    @Override
    public boolean equals(Object objeto) {
        // comprobar null
        if(objeto==null) {
            return false;
            }
        // ver si es de tipo Persona
        if(!(objeto instanceof Actor)) {
            return false;
            }
        // mutacion
        Actor temporal = (Actor)objeto;
        // comparar y devolver resultado
        return super.equals(temporal) && idioma.equals(temporal.idioma);
    }

    @Override
    public String toString() {
        return super.toString() + 
                "Idioma: " + idioma + "\n" 
                ;
    }   
    
}
