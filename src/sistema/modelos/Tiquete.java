/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

tiquete (titulo, descripcion, fecha_creacion, fecha_solucion)
  |--> incidencias (descripcion, 


 */
package sistema.modelos;

import static java.lang.Integer.parseInt;

/**
 *
 * @author jramos
 */
public class Tiquete {

    private int codigoTiquete;
    private String fechaCreacion;
    private String fechaSolucion;
    private String descripcion;
    private String solucion;
    private String estado;
    private int codigoCliente;
    private String titulo;
    private String categoria;
    private String tipo;
    private String prioridad;

    public Tiquete(int codigoTiquete, String fechaCreacion, String fechaSolucion, String descripcion,
        String solucion, String estado, int codigoCliente, String titulo, String categoria, String tipo, String prioridad) {
        this.codigoTiquete = codigoTiquete;
        this.fechaCreacion = fechaCreacion;
        this.fechaSolucion = fechaSolucion;
        this.descripcion = descripcion;
        this.solucion = solucion;
        this.estado = estado;
        this.codigoCliente = codigoCliente;
        this.categoria = categoria;
        this.titulo = titulo;
        this.tipo = tipo;
        this.prioridad = prioridad;
    }
    public Tiquete() {}

    public int getCodigoTiquete() {
        return codigoTiquete;
    }

    public void setCodigoTiquete(int codigoTiquete) {
        this.codigoTiquete = codigoTiquete;
    }
    
    public void setCodigoTiquete(String codigoTiquete) {
        this.codigoTiquete = Integer.parseInt(codigoTiquete);
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaSolucion() {
        return fechaSolucion;
    }

    public void setFechaSolucion(String fechaSolucion) {
        this.fechaSolucion = fechaSolucion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = parseInt(codigoCliente);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
}
