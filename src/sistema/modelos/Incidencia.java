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
    private int codigoIncidencia;
    private String descripcion;
    private int precioUnitario;
    private int codigoTiquete;
    private String tipo;
    private String categoria;
    private String urgencia;
    private String seguimiento;
    private String titulo;

    public Incidencia(int codigoIncidencia, String descripcion, int precioUnitario, int codigoTiquete,
    String tipo, String categoria, String urgencia, String seguimiento,String titulo) {
        
        this.codigoIncidencia = codigoIncidencia;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.codigoTiquete = codigoTiquete;
        this.tipo = tipo;
        this.categoria = categoria;
        this.urgencia = urgencia;
        this.seguimiento = seguimiento;
        this.titulo = titulo;
    }

    public Incidencia() {}

    public int getCodigoIncidencia() {
        return codigoIncidencia;
    }

    public void setCodigoIncidencia(int codigoIncidencia) {
        this.codigoIncidencia = codigoIncidencia;
    }
    
    public void setCodigoIncidencia(String codigoIncidencia) {
        this.codigoIncidencia = Integer.parseInt(codigoIncidencia);
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

    public int getCodigoTiquete() {
        return codigoTiquete;
    }

    public void setCodigoTiquete(int codigoTiquete) {
        this.codigoTiquete = codigoTiquete;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public String getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(String seguimiento) {
        this.seguimiento = seguimiento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }    
}
