/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

import juguetes.RC;
import juguetes.TiroAlBlanco;

/**
 *
 * @author jhona
 */
public class Nohumano implements RC,TiroAlBlanco {

    @Override
    public void acelerar() {
        System.out.println("turum turum turum");
    }

    @Override
    public void arrancar() {
        System.out.println("trrrrrrnnn");
    }

    @Override
    public void jugar() {
        System.out.println("jugando con RC");
    }

    @Override
    public void correrComoelViento() {
        System.out.println("chaca chaca chaca chaca");
    }

    @Override
    public void relinchar() {
        System.out.println("yiiiiiiiijaaaaa");
    }
    
}
