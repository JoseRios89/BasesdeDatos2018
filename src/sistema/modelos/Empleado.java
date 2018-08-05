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
public class Empleado {
    private String nombre;
    private String apellido;
    private String codigoEmpleado;
    private String codigoDepartamento;

    public Empleado(String nombre, String apellido, String codigoEmpleado, String codigoDepartamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoEmpleado = codigoEmpleado;
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }    
}
