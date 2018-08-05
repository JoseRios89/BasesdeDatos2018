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
public class Incidencia {
    private String codigoIncidencia;
    private String descripcion;
    private int precioUnitario;
    private String codigoTiquete;

    public Incidencia(String codigoIncidencia, String descripcion, int precioUnitario, String codigoTiquete) {
        this.codigoIncidencia = codigoIncidencia;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.codigoTiquete = codigoTiquete;
    }

    public String getCodigoIncidencia() {
        return codigoIncidencia;
    }

    public void setCodigoIncidencia(String codigoIncidencia) {
        this.codigoIncidencia = codigoIncidencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getCodigoTiquete() {
        return codigoTiquete;
    }

    public void setCodigoTiquete(String codigoTiquete) {
        this.codigoTiquete = codigoTiquete;
    }
    
    
}
