package com.ejemplo.tiendaalamano.model.shared;

import java.io.Serializable;

public class domiciliarioCrearDto implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private int id;
    private String nombre;
    private String documento;
    private String telefono;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
