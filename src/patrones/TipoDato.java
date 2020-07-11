/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

/**
 * @author Administrador
 */
public abstract class TipoDato {

    private String nombre;

    public TipoDato(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract int getTamano();

    public abstract String TreeDato();

}
