/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

/**
 * @author Administrador
 */
public class Int extends TipoDato {
    private static int numinstancia = 0;

    public Int() {
        super("int" + ++numinstancia);
    }

    public int getTamano() {
        return 4;
    }

    public String TreeDato() {
        return getNombre();
    }

    public void muestra() {
        System.out.println(numinstancia);
        System.out.println(TreeDato());
    }

}
