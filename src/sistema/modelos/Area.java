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
    private String nombre;
    private String codigoArea;


    /* CONSTRUCTOR */
    public Area(String codigoArea, String nombre) {
        this.codigoArea = codigoArea;
        this.nombre = nombre;
    }

    /* GETTERS */
    public String getNombre() {
        return nombre;
    }
    
    public String getCodigoDepartamento() {
        return codigoArea;
    }

    /* SETTERS */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoArea = codigoDepartamento;
    }
}
