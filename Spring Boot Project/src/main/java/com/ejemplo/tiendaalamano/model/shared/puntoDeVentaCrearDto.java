package com.ejemplo.tiendaalamano.model.shared;

import java.io.Serializable;

public class puntoDeVentaCrearDto implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String nombrePuntoDeVenta;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombrePuntoDeVenta() {
        return nombrePuntoDeVenta;
    }
    public void setNombrePuntoDeVenta(String nombrePuntoDeVenta) {
        this.nombrePuntoDeVenta = nombrePuntoDeVenta;
    }
}
