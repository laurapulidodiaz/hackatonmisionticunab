package com.ejemplo.tiendaalamano.model.shared;

import java.io.Serializable;

public class MarcaDto implements Serializable{

    private static final long serialVersionUID =1L;

    private Long idMarca;
    private String nombre;
    private String estado;

    public Long getIdMarca() {
        return idMarca;
    }
    public void setIdMarca(Long idMarca) {
        this.idMarca = idMarca;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
