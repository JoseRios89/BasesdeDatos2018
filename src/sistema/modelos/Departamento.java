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

    /* CONSTRUCTOR */
    public Departamento(String codigoDepartamento, String nombre) {
        this.codigoDepartamento = codigoDepartamento;
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

}
