package com.ejemplo.tiendaalamano.data.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="formapago")

public class formaDePagoEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFormaDePago;

    @Column(nullable = false)
    private String nombreFormaDePago;

    public long getIdFormaDePago() {
        return idFormaDePago;
    }

    public void setIdFormaDePago(long idFormaDePago) {
        this.idFormaDePago = idFormaDePago;
    }

    public String getNombreFormaDePago() {
        return nombreFormaDePago;
    }

    public void setNombreFormaDePago(String nombreFormaDePago) {
        this.nombreFormaDePago = nombreFormaDePago;
    }
}
