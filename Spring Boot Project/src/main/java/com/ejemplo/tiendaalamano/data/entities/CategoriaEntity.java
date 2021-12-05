package com.ejemplo.tiendaalamano.data.entities;

import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "categorias")
public class CategoriaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id_categoria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoria;

    @Column(name="nombre")
    private String nombre;

    @Column(name="estado")
    private String estado;

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "categoriaModel")
    //private List<ProductoEntity> productoModelList = new ArrayList<>();

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
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
