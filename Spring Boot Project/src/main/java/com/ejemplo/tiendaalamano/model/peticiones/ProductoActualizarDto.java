package com.ejemplo.tiendaalamano.model.peticiones;

import java.io.Serializable;
import java.util.List;

import com.ejemplo.tiendaalamano.model.shared.CategoriaDto;

public class ProductoActualizarDto implements Serializable {

    private static final long serialVersionUID =1L;

    private Double valor;
    private List<CategoriaDto> categoriaDto;
    private Integer inventario;
    private String estado;
    
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public List<CategoriaDto> getCategoriaDto() {
        return categoriaDto;
    }
    public void setCategoriaDto(List<CategoriaDto> categoriaDto) {
        this.categoriaDto = categoriaDto;
    }
    public Integer getInventario() {
        return inventario;
    }
    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
