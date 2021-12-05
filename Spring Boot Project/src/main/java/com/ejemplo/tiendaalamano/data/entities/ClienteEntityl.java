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
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "clientes")


@Table(indexes = {
    
    @Index(columnList = "idCliente", name = "index_idcliente", unique = true),
    @Index(columnList = "nombre", name = "index_nombre", unique = true),
})



public class ClienteEntityl implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCliente;

    @Column(nullable = false, length = 15)
    private String username;

    @Column(nullable = false, length = 15)
    private String pass;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 15)
    private String documento;

    @Column(nullable = false)
    private int idDireccion;

    @Column(nullable = false, length = 15)
    private String telefono;

    @Column(nullable = false, length = 10)
    private String estado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteModel")
    private List<DireccionEntity> direccionModelList = new ArrayList<>();

    
    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
    

