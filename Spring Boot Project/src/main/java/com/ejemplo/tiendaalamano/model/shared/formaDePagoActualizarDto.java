package com.ejemplo.tiendaalamano.model.shared;

import java.io.Serializable;

public class formaDePagoActualizarDto implements Serializable{
    private static final long serialVersionUID = 1L;

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
