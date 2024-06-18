/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juguetes;
import roles.*;
/**
 *
 * @author jhona
 */
public interface Rex extends Juguete,Dinosaurio {
    void vencer(Villano v);
    void jugarVideojuegos();
}
