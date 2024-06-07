/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multipliecaso2;

/**
 *
 * @author jhona
 */
public class Practicante extends Trabajador implements Alumno {
    private String nss;
    private String boleta;
    public Practicante() {
       super();
        nss="";
        boleta=boleta;
    }
    public Practicante(String genero, double peso, double talla,
            String nombre, int edad,
            double sueldo,
            double pago_hora,String nss, String boleta) {
        super(genero, peso, talla, nombre, edad,sueldo,pago_hora);
        this.nss = nss;
        this.boleta=boleta;
    }  
    public Practicante(Practicante practicante) {
        super(practicante);
        nss = practicante.nss;
        boleta=practicante.boleta;
    }
    
    @Override
    public void destruir() {
        super.destruir();
        if (nss!=null){
            nss=null;            
        }
        if (boleta!=null){
            boleta=null;            
        }
        System.gc();
    }
    public void setPracticante(String genero, double peso, double talla,
            String nombre, int edad,
            double pago_hora,
            double sueldo,String nss){
        super.setTrabajador(genero, peso, talla, nombre, edad, sueldo, pago_hora);
        this.nss=nss;
        this.boleta=boleta;
    }
    public double cobrar(){
       return super.cobrar();
    }


    @Override
    public void estudiar(){
        System.out.println("ESTUDIANDO");
    }
    @Override
    public void estudiar(String UA){
        System.out.println("ESTUDIANDO : " + UA);
    }
    @Override
    public void comer(String comida ,String donde){
        super.comer(donde);
        System.out.println("COMIENDO : "+ comida);
    }
    public boolean equals (Object objeto){
        if (objeto==null){
            return false;
        }
        if(!(objeto instanceof Trabajador)) {
            return false;
        }
        Practicante alguien = (Practicante) objeto;
        return super.equals(alguien) && alguien.nss==nss;
    }
        public String to_string( ){
        return super.to_string(this) + "\nnumero de seguridad social:  " + nss + " \nboleta: " + boleta    ;
        
    }
    
}
