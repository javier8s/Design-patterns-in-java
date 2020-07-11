/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

/**
 * @author Administrador
 */
public class Boolean extends TipoDato {
    private static int numinstancia = 0;

    public Boolean() {
        super("Boolean" + ++numinstancia);
    }

    public int getTamano() {
        return 1;
    }

    public String TreeDato() {
        return getNombre();
    }


}
