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
public class ordenuno  implements Operacionespuras {

    @Override
    public int sumar(int x, int y) {
        return Practica1.sumarecursiva(x, y);
    }
    @Override
    public int restar(int x, int y) {
        return Practica1.restarecursiva(x, y);
    }
    @Override
    public int multiplicar(int x, int y) {
        return Practica1.multiplicacionrecursiva(x, y);
    }
    @Override
    public int dividir(int x, int y) {
        return Practica1.divisionrecursiva(x, y);
    }
    @Override
    public int modulo(int x, int y) {
        return Practica1.modulorecursivo(x, y);
    }
}
