/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juguetes;

import roles.Astronauta;
import roles.Heroe;
import roles.Juguete;

/**
 *
 * @author jhona
 */
public interface BuzzLightyear extends Astronauta,Juguete,Heroe {
    void dispararLaser();
    String personaje();
}
