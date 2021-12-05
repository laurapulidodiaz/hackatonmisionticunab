package com.ejemplo.tiendaalamano.model.shared;

import java.io.Serializable;
import java.util.List;

public class ProductoDto implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long idProducto;
    private String nombre;
    private Double valor;
    private List<CategoriaDto> categoriaRestModel;
    private List<MarcaDto> marcaDto;
    private Integer inventario;
    private String estado;
    
    public Long getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public List<CategoriaDto> getCategoriaRestModel() {
        return categoriaRestModel;
    }
    public void setCategoriaRestModel(List<CategoriaDto> categoriaRestModel) {
        this.categoriaRestModel = categoriaRestModel;
    }
    public List<MarcaDto> getMarcaDto() {
        return marcaDto;
    }
    public void setMarcaDto(List<MarcaDto> marcaDto) {
        this.marcaDto = marcaDto;
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