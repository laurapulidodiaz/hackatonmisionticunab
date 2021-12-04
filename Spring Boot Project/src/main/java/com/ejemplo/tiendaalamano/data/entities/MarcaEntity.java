package com.ejemplo.tiendaalamano.data.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import javax.persistence.Index;

@Entity(name = "marcas")
@Table(indexes = {
    @Index(columnList = "idMarca", name = "index_idmarca", unique = true),
    @Index(columnList = "nombre", name = "index_nombre", unique = true),
    
})
public class MarcaEntity implements Serializable{

    private static final long serialVersionUID =1L;
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMarca;


    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 10)
    private String estado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "marcaModel")
    private List<ProductoEntity> productoModelList = new ArrayList<>();
    

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
