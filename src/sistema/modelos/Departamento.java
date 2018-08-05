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
public class Departamento {
    /* VARIABLES */
    private String nombre;
    private String codigoDepartamento;
    private String codigoArea;

    /* CONSTRUCTOR */
    public Departamento(String codigoDepartamento, String nombre, String codigoArea) {
        this.codigoDepartamento = codigoDepartamento;
        this.codigoArea = codigoArea;
        this.nombre = nombre;
    }

    /* GETTERS */
    public String getNombre() {
        return nombre;
    }
    
    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    /* SETTERS */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }
}
