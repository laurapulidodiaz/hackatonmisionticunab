package com.ejemplo.tiendaalamano.data.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;



@Entity(name="ordenes")



public class OrdenCompra implements Serializable{
    private static final long serialVersionUID=1L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrden;

    @Column(nullable = true)
    private Long idCliente;

    @Column(nullable = true)
    private Long idDomiciliario;

    @Column(nullable = true)
    private Long idDireccion;

    @Column(nullable = true)
    private Long idFormaPago;

    @Column(nullable = true)
    private Long id_PuntoDeVenta;

    @Column(nullable = true)
    private Double subtotal;

    @Column(nullable = true)
    private Double impuesto;

    @Column(nullable = true)
    private Double total;

    @Column(nullable = true, length =10)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "cliente_Id")
    private ClienteEntityl clienteEntityl;

    @ManyToOne
    @JoinColumn(name = "domiciliario_Id")
    DomiciliarioEntity domiciliarioEntity;

    @ManyToOne
    @JoinColumn(name = "direccion_Id")
    private DireccionEntity direccionEntity;
    
}
