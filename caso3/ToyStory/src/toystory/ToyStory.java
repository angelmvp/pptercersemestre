/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toystory;
import Personas.*;
import roles.Heroe;
import roles.Villano;
public class ToyStory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("EMPEZANDO PELICULA PRODUCIDA POR ANGEL MARTIN VAZQUEZ PEREZ");
        System.out.println("CREDITOS MVP");
        System.out.println("RECORD 3..2...1...\n\n");
        System.out.println("Habia una vez un mundo de muchos Juguetes ");
        
       
        //CREACION DE OBJETOS 
        
        DonRickles don = new DonRickles("Masculino", 70.0, 1.75, "Don Rickles", 90, "Inglés");
        JimVarney jim = new JimVarney("Masculino", 68.0, 1.83, "Jim Varney", 50, "Inglés");
        JoanCusack joan = new JoanCusack("Femenino", 60.0, 1.75, "Joan Cusack", 55, "Inglés");
        JodiBenson jodi = new JodiBenson("Femenino", 58.0, 1.70, "Jodi Benson", 60, "Inglés");
        JohnRatzenberger john = new JohnRatzenberger("Masculino", 85.0, 1.82, "John Ratzenberger", 70, "Inglés");
        NedBeatty ned = new NedBeatty("Masculino", 90.0, 1.76, "Ned Beatty", 83, "Inglés");
        
        TomHanks tom = new TomHanks("Masculino", 75.0, 1.83, "Tom Hanks", 64, "Inglés");
        WallaceShawn wallace=new WallaceShawn("Masculino", 75.0, 1.83, "Tom Hanks", 64, "Inglés");
        AndrewStanton andrew = new AndrewStanton("Masculino", 75.0, 1.80, "Andrew Stanton", 55, "Inglés");
        TimAllen tim = new TimAllen("Masculino", 80.0, 1.83, "Tim Allen", 67, "Inglés");
        Nohumano maquina=new Nohumano();
                
        
        System.out.println("--Habia una vez un vaquero que defendia a un pueblo");
        tom.impartirLey();
        System.out.println("--era muy comico tambien");
        tom.chistar();
        System.out.println("--de rrepente  el vaquero llega a un pueblo yaparece un robot que le gusta hacer el mal");
        andrew.decirlaverdad("YO SOY TU PADRE");
        System.out.println("--El estaba luchando con un astronauta");
        tim.dispararLaser();
        andrew.disparar();
        System.out.println("--la pelea estaba muy reñida y llega el vaquero a apoyar");
        tom.apoyar();
        System.out.println("--Despues llega otra vaquerita montada de su caballo");
        joan.montar();
        maquina.correrComoelViento();
        maquina.relinchar();
        joan.protegerPueblo();
        System.out.println("--Logran derrotar a el villano");
        tom.protegerPueblo();
        System.out.println("--SE HACEN Amigos y El vaquero los invita a su casa");
        System.out.println(".....LLegando a la casa le presenta a sus amigos que estaban jugando videojuegos");
        wallace.jugarVideojuegos();
        john.jugarVideojuegos();
        System.out.println("--El vaquero les dice que ellos son REx y Ham luego se acerca su amigo RC");
        maquina.acelerar();
        System.out.println("--Despues se acerca un perrito");
        jim.ladrar();
        jim.estirarse();
        System.out.println("--Para finalizar un señor con sus hijitos, el se puede desarmar ");
        don.desarmar();
        System.out.println("--Que pasa, el cerdo Jam se enoja y se hace malo, al mism o tiempo llega"
                        + "  otro villano Lotso con sus tropas");
        john.robar();
        ned.mandar();
        System.out.println("--BARBIE LLega como distraccion");
        jodi.modelar();
        System.out.println("--EMPIEZA UN CAOOOOOOS, una peleaaa, el vaquero lo va a controlar");
        tom.impartirLey();
        System.out.println("--Empiezan a dispararse");
        tim.dispararLaser();
        wallace.rugir();
        System.out.println("--Lotso saca sus poderes ");
        ned.comerMiel();
        System.out.println("--Jessie avanza con Tiro al blacno");
        maquina.correrComoelViento();
        joan.montar();
        System.out.println("--Al final lograron vencer a lotso y señor tocino");
        tom.apoyar();
        System.out.println("--Una vez mas Woody salvando al pueblo");
        
        
        
        
        
    }
    
}
