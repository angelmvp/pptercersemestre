/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multipliecaso2;

import simple.Persona;

/**
 *
 * @author jhona
 */
public class Trabajador extends Persona {
    private double SUELDO ;
    private double PAGO_HORA ;
    public Trabajador(){
        super();
        SUELDO=0;
        PAGO_HORA=0;
    }
    
    public Trabajador(String genero, double peso, double talla, 
            String nombre, int edad, double sueldo,double pago_hora){
        super(genero,peso,talla,nombre,edad);
        this.SUELDO=sueldo;
        this.PAGO_HORA=pago_hora;      
    }
    public Trabajador(Trabajador alguno){
        super(alguno);
        PAGO_HORA=alguno.PAGO_HORA;
        SUELDO=alguno.SUELDO;
    }
    @Override
    public void destruir() {
        super.destruir();
        System.gc();
    }
    public void setTrabajador(String genero, double peso, double talla, 
            String nombre, int edad, double sueldo, double pago_hora) {
        setPersona(genero, peso, talla, nombre, edad);
        this.PAGO_HORA=pago_hora;
        this.SUELDO=sueldo;
    }
    public void respirar(String estado, String donde) {
        respirar(estado);
        System.out.println(donde);
    }
    public void comer(String donde){
        super.comer();
        System.out.println("Comiendo en :  "  +  donde);
    }
    public double cobrar(){
        return SUELDO;
    }
    public void trabajar() {
        System.out.println("Trabajando");
    }
    public void trabajar(int horas_extra){
        trabajar();
        SUELDO += ((PAGO_HORA*2)*horas_extra);
    }
    @Override
    public boolean equals (Object alguno){
        if(alguno==null){
            return false;
        }
        if(!(alguno instanceof Persona)) {
            return false;
        }
        Trabajador alguien = (Trabajador) alguno;
        return SUELDO==alguien.SUELDO && super.equals(alguno) && PAGO_HORA==alguien.PAGO_HORA;
    }
    
    public String to_string(Trabajador alguien){
        if(alguien==null){
            return "";
        }
        return super.toString()+ "\n Sueldo:  " + alguien.SUELDO + "\n Pago_hora: " + alguien.PAGO_HORA;
    }
    
    
}
