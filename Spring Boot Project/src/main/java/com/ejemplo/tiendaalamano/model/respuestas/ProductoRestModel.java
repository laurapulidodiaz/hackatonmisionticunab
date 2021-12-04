package com.ejemplo.tiendaalamano.model.respuestas;

import java.util.List;

public class ProductoRestModel {

    private String nombre;
    private Double valor;
    private List<CategoriaRestModel> categoriaRestModel;
    private List<MarcaRestModel> marcaRestModel;
    private Integer inventario;

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
    public List<CategoriaRestModel> getCategoriaRestModel() {
        return categoriaRestModel;
    }
    public void setCategoriaRestModel(List<CategoriaRestModel> categoriaRestModel) {
        this.categoriaRestModel = categoriaRestModel;
    }
    public List<MarcaRestModel> getMarcaRestModel() {
        return marcaRestModel;
    }
    public void setMarcaRestModel(List<MarcaRestModel> marcaRestModel) {
        this.marcaRestModel = marcaRestModel;
    }
    public Integer getInventario() {
        return inventario;
    }
    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }

    
    
}
