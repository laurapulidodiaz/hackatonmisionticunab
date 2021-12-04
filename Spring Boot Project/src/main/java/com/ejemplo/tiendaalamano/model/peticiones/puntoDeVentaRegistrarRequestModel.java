package com.ejemplo.tiendaalamano.model.peticiones;

import java.io.Serializable;

public class puntoDeVentaRegistrarRequestModel implements Serializable{
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
