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
	
	@Column(name = "cantidad", nullable = true)
	private Double cantidad;
	
	@Column(name = "precio", nullable = true)
	private Double precio;
	
	@Column(name = "impuesto", nullable = true)
	private Double impuesto;
	
	@Column(name = "descuento", nullable = true)
	private Double descuento;
	
	@Column(name = "puntos", nullable = true)
	private Double puntos;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pedido_id", referencedColumnName = "id", nullable = true)
	private PedidoEntity pedido_id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "producto_id", referencedColumnName = "id", nullable = true)
	private ProductoEntity producto_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(Double impuesto) {
		this.impuesto = impuesto;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Double getPuntos() {
		return puntos;
	}

	public void setPuntos(Double puntos) {
		this.puntos = puntos;
	}

	public PedidoEntity getPedido_id() {
		return pedido_id;
	}

	public void setPedido_id(PedidoEntity pedido_id) {
		this.pedido_id = pedido_id;
	}

	public ProductoEntity getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(ProductoEntity producto_id) {
		this.producto_id = producto_id;
	}
	
	
	
	
	
	
	

}
