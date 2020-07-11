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
public class Referencia extends TipoDato {
    private static int numinstancia = 0;
    private ArrayList<TipoDato> e = new ArrayList<>();

    public Referencia() {
        super("Referencia" + ++numinstancia);
    }

    public void insertarTipoDato(TipoDato... r) {
        for (int i = 0; i < r.length; i++)
            e.add(r[i]);
    }

    public String TreeDato() {
        if (e.size() == 0) return getNombre() + "=(null)";
        else {
            String acum = this.getNombre() + "=(";
            for (int i = 0; i < e.size(); i++) {
                System.out.println("-------");
                acum = acum + e.get(i).TreeDato() + "";
            }
            return acum + ")";
        }
    }

    public int getTamano() {
        int acum = 0;
        for (int i = 0; i < e.size(); i++) {
            acum = acum + e.get(i).getTamano();
        }
        return acum;
    }

}
