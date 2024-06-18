/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roles;

/**
 *
 * @author jhona
 */
public interface Villano {
    void destruir(Villano v);
    void destruir(Heroe h);
    void destruir(Juguete j);
}
