/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.util.ArrayList;

/**
 * @author Administrador
 */
public class Patrones {


    public static void main(String[] args) {
        Referencia a = new Referencia();
        a.getNombre();
        Int b = new Int();
        b.muestra();
        boolean[] sra = new boolean[10];
        System.out.println(sra[1] + "-----------------");
        System.out.println(a.TreeDato());
        a.insertarTipoDato(b);
        a.insertarTipoDato(b);
        a.insertarTipoDato(b);
        System.out.println(a.getNombre());
        System.out.println(a.TreeDato());
        System.out.println(a.getTamano());

        System.out.println();

    }

}
