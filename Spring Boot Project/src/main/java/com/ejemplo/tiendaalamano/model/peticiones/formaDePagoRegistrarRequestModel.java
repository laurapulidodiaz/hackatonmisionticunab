package com.ejemplo.tiendaalamano.model.peticiones;

public class formaDePagoRegistrarRequestModel {
    private int id;
    private String nombreFormaDePago;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombreFormaDePago() {
        return nombreFormaDePago;
    }
    public void setNombreFormaDePago(String nombreFormaDePago) {
        this.nombreFormaDePago = nombreFormaDePago;
    }
    
}
