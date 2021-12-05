package com.ejemplo.tiendaalamano.model.shared;

import java.io.Serializable;

public class CategoriaDto implements Serializable{

    private static final long serialVersionUID =1L;

    private Long idCategoria;
    private String nombre;
    private String estado;
    
    public Long getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
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
