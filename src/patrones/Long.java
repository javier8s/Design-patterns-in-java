/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

/**
 * @author Administrador
 */
public class Long extends TipoDato {
    private static int numinstancia = 0;

    public Long() {
        super("int" + ++numinstancia);
    }

    public int getTamano() {
        return 4;
    }

    public String TreeDato() {
        return getNombre();
    }


}
