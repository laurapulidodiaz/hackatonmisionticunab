package com.ejemplo.tiendaalamano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Producto")
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idProducto;

    @Column(unique = true, nullable = false)
    private String Nombre;
    private int Precio;
    private String CantidadStrock;
    private String Categoria;
    private int Impuesto;


    public Producto() {
    }


    public Producto(Long idProducto, String Nombre, int Precio, String CantidadStrock, String Categoria, int Impuesto) {
        this.idProducto = idProducto;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.CantidadStrock = CantidadStrock;
        this.Categoria = Categoria;
        this.Impuesto = Impuesto;
    }


    public Long getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecio() {
        return this.Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getCantidadStrock() {
        return this.CantidadStrock;
    }

    public void setCantidadStrock(String CantidadStrock) {
        this.CantidadStrock = CantidadStrock;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        this.Categoria = categoria;
    }

    public int getImpuesto() {
        return Impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.Impuesto = impuesto;
    }


    public Long getId() {
        return null;
    }

}
