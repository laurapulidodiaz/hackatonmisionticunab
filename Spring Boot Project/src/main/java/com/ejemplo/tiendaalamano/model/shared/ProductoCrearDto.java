package com.ejemplo.tiendaalamano.model.shared;

import java.io.Serializable;
import java.util.List;

import com.ejemplo.tiendaalamano.model.respuestas.CategoriaRestModel;
import com.ejemplo.tiendaalamano.model.respuestas.MarcaRestModel;

public class ProductoCrearDto implements Serializable{

    private static final long serialVersionUID =1L;

    private Long idProducto;
    private String nombre;
    private Double valor;
    private List<CategoriaRestModel> categoriaRestModel;
    private List<MarcaRestModel> marcaRestModel;
    private Integer inventario;

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
