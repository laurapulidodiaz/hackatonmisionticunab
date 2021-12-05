package com.ejemplo.tiendaalamano.data.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administrador")
public class AdministradorEntity implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @Column(name="id_administrador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_administrador;

    @Column(name="username")
    private String username;

    @Column(name="pass")
    private String pass;

    @Column(name="nombre")
    private String nombre;

    @Column(name="documento")
    private String documento;

    @Column(name="id_direccion")
    private int id_direccion;

    @Column(name="telefono")
    private String telefono;

    public Integer getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(Integer id_administrador) {
        this.id_administrador = id_administrador;
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

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}