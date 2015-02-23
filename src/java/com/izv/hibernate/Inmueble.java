package com.izv.hibernate;
// Generated 30-ene-2015 17:20:25 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Inmueble generated by hbm2java
 */
public class Inmueble  implements java.io.Serializable {


     private Integer id;
     private String localidad;
     private String direccion;
     private String tipo;
     private String usuario;
     private Date fechaalta;
     private BigDecimal precio;

    public Inmueble() {
    }

	
    public Inmueble(String localidad, String direccion, String tipo, String usuario) {
        this.localidad = localidad;
        this.direccion = direccion;
        this.tipo = tipo;
        this.usuario = usuario;
    }
    public Inmueble(String localidad, String direccion, String tipo, String usuario, Date fechaalta, BigDecimal precio) {
       this.localidad = localidad;
       this.direccion = direccion;
       this.tipo = tipo;
       this.usuario = usuario;
       this.fechaalta = fechaalta;
       this.precio = precio;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLocalidad() {
        return this.localidad;
    }
    
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public Date getFechaalta() {
        return this.fechaalta;
    }
    
    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }
    public BigDecimal getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }




}


