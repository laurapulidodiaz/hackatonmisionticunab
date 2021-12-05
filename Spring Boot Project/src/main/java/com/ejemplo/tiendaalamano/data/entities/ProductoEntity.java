package com.ejemplo.tiendaalamano.data.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="productos")
public class ProductoEntity implements Serializable{
    private static final long serialVersionUID=1L;

    @Id
    @Column(name="id_producto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_producto;

    @Column(name="nombre")
    private String nombre;

    @Column(name="valor")
    private Double valor;

    @Column(name="estado")
    private String estado;

    @Column(name="inventario")
    private Integer inventario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_marca", referencedColumnName = "id_marca", nullable = false)
    private MarcaEntity marcaModel;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria", nullable = false)
    private CategoriaEntity categoriaModel;


    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getInventario() {
        return inventario;
    }

    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }

    public MarcaEntity getMarcaModel() {
        return marcaModel;
    }

    public void setMarcaModel(MarcaEntity marcaModel) {
        this.marcaModel = marcaModel;
    }

    public CategoriaEntity getCategoriaModel() {
        return categoriaModel;
    }

    public void setCategoriaModel(CategoriaEntity categoriaModel) {
        this.categoriaModel = categoriaModel;
    }    
    
}
