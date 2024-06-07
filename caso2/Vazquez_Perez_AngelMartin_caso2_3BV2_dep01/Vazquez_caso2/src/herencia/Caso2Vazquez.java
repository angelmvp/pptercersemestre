
package herencia;

import Multipliecaso2.Practicante;
import simple.Persona;
import simple.SerHumano;

/**
 *
 * @author Saul
 */
public class Caso2Vazquez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PERSONA HEREDANDO DE LA CLASE ALUMNO E IMPLEMENTANDO LA INTERFAZ TRABAJADOR
       // Becario rocio = new Becario("Femenino", 3.56, 45.0, 
       //                             "Rocio Vazquez Perez", 18,
       //                             "202412340",
       //                             5890.12);
       // System.out.println(rocio);
       // rocio.respirar();
       // rocio.comer("Chilaquiles", "ESCOM");
       // rocio.estudiar("Paradigmas");
       // rocio.trabajar();
       // System.out.println(rocio.cobrar());
       // rocio.trabajar(2);
       // System.out.println(rocio.cobrar());
        
        
        
       //PRACTICANTE HEREDANDO DE LA CLASETRABAJADOR E IMPLEMENTANDO LA INTERFAZ ALUMNO
       System.out.println("\n\nCASO 1 PERSONA HEREDANDO DE LA CLASETRABAJADOR E IMPLEMENTANDO LA INTERFAZ ALUMNO \n ");
        Practicante juan = new Practicante("Masculino", 3.33, 48.8, 
                                    "Juan Castro Paes", 23,
                                    9000,1000,"111285635-1","2023565878");
        System.out.println(juan.to_string());
        juan.respirar();
        juan.comer("Torta de jamon", "Oficina");
        juan.estudiar("Ecuaciones diferenciales");
        juan.trabajar();
        System.out.println("total cobrado: " + juan.cobrar());
        juan.trabajar(2);
        System.out.println("total cobrado: " + juan.cobrar());
    }
    
}
