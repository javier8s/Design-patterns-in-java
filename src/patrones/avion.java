/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

/**
 * @author Administrador
 */
public class avion {
    private static int num;
    private int avion;

    public avion(int avion) {
        this.avion = avion;
    }

    public int getvalor() {
        return avion;
    }

    public void daralas() {
        ala a = new ala(avion, 1);
    }

}
