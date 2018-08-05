/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.modelos;
import java.util.Date;

/**
 *
 * @author jramos
 */
public class Tiquete {
    private String codigoTiquete;
    private Date fechaCreacion;
    private Date fechaSolucion;
    private String descripcion;
    private String solucion;
    private String estado;
    private String codigoCliente;

    public Tiquete(String codigoTiquete, Date fechaCreacion, Date fechaSolucion, String descripcion, String solucion, String estado, String codigoCliente) {
        this.codigoTiquete = codigoTiquete;
        this.fechaCreacion = fechaCreacion;
        this.fechaSolucion = fechaSolucion;
        this.descripcion = descripcion;
        this.solucion = solucion;
        this.estado = estado;
        this.codigoCliente = codigoCliente;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaSolucion() {
        return fechaSolucion;
    }

    public void setFechaSolucion(Date fechaSolucion) {
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

    public void setCodigoTiquete(String codigoTiquete) {
        this.codigoTiquete = codigoTiquete;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
}
