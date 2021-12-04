package com.ejemplo.tiendaalamano.data.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="puntoventa")

public class PuntoVenta implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idpuntoDeVenta;

    @Column(nullable = false)
    private String nombrePuntoDeVenta;

    public long getIdpuntoDeVenta() {
        return idpuntoDeVenta;
    }

    public void setIdpuntoDeVenta(long idpuntoDeVenta) {
        this.idpuntoDeVenta = idpuntoDeVenta;
    }

    public String getNombrePuntoDeVenta() {
        return nombrePuntoDeVenta;
    }

    public void setNombrePuntoDeVenta(String nombrePuntoDeVenta) {
        this.nombrePuntoDeVenta = nombrePuntoDeVenta;
    }
    
}
