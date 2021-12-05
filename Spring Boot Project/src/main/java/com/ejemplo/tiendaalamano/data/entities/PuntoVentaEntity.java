package com.ejemplo.tiendaalamano.data.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="puntoventa")
public class PuntoVentaEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id_PuntoDeVenta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_PuntoDeVenta;

    @Column(name="nombrePuntoDeVenta")
    private String nombrePuntoDeVenta;

    public Integer getId_PuntoDeVenta() {
        return id_PuntoDeVenta;
    }

    public void setId_PuntoDeVenta(Integer id_PuntoDeVenta) {
        this.id_PuntoDeVenta = id_PuntoDeVenta;
    }

    public String getNombrePuntoDeVenta() {
        return nombrePuntoDeVenta;
    }

    public void setNombrePuntoDeVenta(String nombrePuntoDeVenta) {
        this.nombrePuntoDeVenta = nombrePuntoDeVenta;
    }
}
