package com.ejemplo.tiendaalamano.data.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="marcas")
public class MarcaEntity implements Serializable{
    private static final long serialVersionUID =1L;
    
    @Id
    @Column(name="id_marca")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_marca;

    @Column(nullable = true, length = 50)
    private String nombre;

    @Column(nullable = true, length = 10)
    private String estado;

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "marcaModel")
    //private List<ProductoEntity> productoModelList = new ArrayList<>();
    

    public Integer getid_marca() {
        return id_marca;
    }

    public void setid_marca(Integer id_marca) {
        this.id_marca = id_marca;
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
