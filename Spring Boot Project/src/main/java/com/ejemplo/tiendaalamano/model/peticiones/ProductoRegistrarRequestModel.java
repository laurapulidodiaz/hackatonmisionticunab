package com.ejemplo.tiendaalamano.model.peticiones;

public class ProductoRegistrarRequestModel {

    private String nombre;
    private Double valor;
    private Long idCategoria;
    private Long idMarca;
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
    public Long getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }
    public Long getIdMarca() {
        return idMarca;
    }
    public void setIdMarca(Long idMarca) {
        this.idMarca = idMarca;
    }
    public Integer getInventario() {
        return inventario;
    }
    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }
    
}
