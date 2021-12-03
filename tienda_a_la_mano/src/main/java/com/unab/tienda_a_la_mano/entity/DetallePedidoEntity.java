package com.unab.tienda_a_la_mano.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity()
@Table(name = "DetallePedidos")
public class DetallePedidoEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "cantidad", nullable = false)
	private Double cantidad;
	
	@Column(name = "precio", nullable = false)
	private Double precio;
	
	@Column(name = "impuesto", nullable = false)
	private Double impuesto;
	
	@Column(name = "descuento", nullable = false)
	private Double descuento;
	
	@Column(name = "puntos", nullable = false)
	private Double puntos;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "pedido_id", referencedColumnName = "id", nullable = false)
	private PedidoEntity pedido_id;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "producto_id", referencedColumnName = "id", nullable = false)
	private ProductoEntity producto_id;
	
	
	
	
	

}
