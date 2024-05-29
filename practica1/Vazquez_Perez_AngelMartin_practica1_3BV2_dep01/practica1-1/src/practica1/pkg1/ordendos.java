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
public class ordendos  implements Operacionespuras {

    @Override
    public int sumar(int x, int y) {
        return Practica1.sumasegundo(x, y);
    }
    @Override
    public int restar(int x, int y) {
        return Practica1.restasegundo(x, y);
    }
    @Override
    public int multiplicar(int x, int y) {
        return Practica1.multiplicacionsegundo(x, y);
    }
    @Override
    public int dividir(int x, int y) {
        return Practica1.divisionsegundo(x, y);
    }
    @Override
    public int modulo(int x, int y) {
        return Practica1.modulosegundo(x, y);
    }
}
    
