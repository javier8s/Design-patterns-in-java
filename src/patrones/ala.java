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
public class ala {
    private ArrayList<Integer> alas = new ArrayList<>();
    private int lado;

    public ala(int avion, int lado) {
        this.lado = lado;
        añadir(lado);
    }

    public void añadir(int lado) {
        alas.add(lado);
    }

    public int getlado1() {
        return lado;
    }
}
