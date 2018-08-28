/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.modelos;

/**
 *
 * @author jramos
 */
public class Area {
    /* VARIABLES */
    private int codigoArea;
    private String nombre;

    /* CONSTRUCTOR */
    public Area(int codigoArea, String nombre) {
        this.codigoArea = codigoArea;
        this.nombre = nombre;
    }

    public Area() {

    }

    /* GETTERS */
    public String getNombre() {
        return nombre;
    }
    
    public int getCodigoArea() {
        return codigoArea;
    }

    /* SETTERS */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCodigoArea(String codigoArea) {
        this.codigoArea = Integer.parseInt(codigoArea);
    }
    
    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }
}
