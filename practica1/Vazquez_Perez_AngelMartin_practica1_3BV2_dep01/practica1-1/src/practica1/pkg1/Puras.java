/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.pkg1;

/**
 *
 * @author jhona
 */


public class Puras implements Operacionespuras {

    @Override
    public int sumar(int x, int y) {
        return Practica1.sumapura(x, y);
    }
    @Override
    public int restar(int x, int y) {
        return Practica1.restapura(x, y);
    }
    @Override
    public int multiplicar(int x, int y) {
        return Practica1.multiplicacionpura(x, y);
    }
    @Override
    public int dividir(int x, int y) {
        return Practica1.divisionpura(x, y);
    }
    @Override
    public int modulo(int x, int y) {
        return Practica1.modulopuro(x, y);
    }
}

