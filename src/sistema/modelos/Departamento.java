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
    private int codigoDepartamento;
    private int codigoArea;

    /* CONSTRUCTOR */
    public Departamento(int codigoDepartamento, String nombre, int codigoArea) {
        this.codigoDepartamento = codigoDepartamento;
        this.codigoArea = codigoArea;
        this.nombre = nombre;
    }
    public Departamento() {}

    /* GETTERS */
    public String getNombre() {
        return nombre;
    }
    
    public int getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(int codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }
        
    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = Integer.parseInt(codigoDepartamento);
    }

    /* SETTERS */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }
}
