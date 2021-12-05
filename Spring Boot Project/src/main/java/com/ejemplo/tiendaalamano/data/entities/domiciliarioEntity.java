package com.ejemplo.tiendaalamano.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="domiciliarios")
public class DomiciliarioEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDomiciliario;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String documento;

    @Column(nullable = false, length = 15)
    private String telefono;

    public int getIdDomiciliario() {
        return idDomiciliario;
    }

    public void setIdDomiciliario(int idDomiciliario) {
        this.idDomiciliario = idDomiciliario;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
