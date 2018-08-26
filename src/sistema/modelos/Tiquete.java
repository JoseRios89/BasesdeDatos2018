/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

tiquete (titulo, descripcion, fecha_creacion, fecha_solucion)
  |--> incidencias (descripcion, 


 */
package sistema.modelos;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jramos
 */
public class Tiquete {
    private final static String[] CATEGORIAS = { "Software", "Hardware" };
    private final static String[] TIPOS = { "Incidente", "Mantenimiento", "Arreglo" };
    private final static String[] PRIORIDADES = { "Alta", "Media", "Baja" };
    private String codigoTiquete;
    private String fechaCreacion;
    private String fechaSolucion;
    private String descripcion;
    private String solucion;
    private String estado;
    private String codigoCliente;
    private String titulo;


    public Tiquete(String codigoTiquete, String fechaCreacion, String fechaSolucion, String descripcion, String solucion, String estado, String codigoCliente, String titulo) {
        this.codigoTiquete = codigoTiquete;
        this.fechaCreacion = fechaCreacion;
        this.fechaSolucion = fechaSolucion;
        this.descripcion = descripcion;
        this.solucion = solucion;
        this.estado = estado;
        this.codigoCliente = codigoCliente;
        this.titulo = titulo;

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

    public String getCodigoTiquete() {
        return codigoTiquete;
    }

    public static String[] getCATEGORIAS() {
        return CATEGORIAS;
    }

    public static String[] getTIPOS() {
        return TIPOS;
    }

    public static String[] getPRIORIDADES() {
        return PRIORIDADES;
    }

    public void setCodigoTiquete(String codigoTiquete) {
        this.codigoTiquete = codigoTiquete;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}