package com.unab.tienda_a_la_mano.entity;

import java.io.Serializable;
import java.sql.Date;

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
@Table(name = "CambioPedidos")
public class CambioPedidoEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "comentario",  length = 40, nullable = true)
	private String comentario;	
	
	@Column(name = "fecha", nullable = true)
	private Date fecha;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "prouducto_anterior_id", referencedColumnName = "id", nullable = true)
	private ProductoEntity producto_anterior;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "prouducto_id", referencedColumnName = "id", nullable = true)
	private ProductoEntity producto;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pedido_id", referencedColumnName = "id", nullable = true)
	private PedidoEntity pedido;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public ProductoEntity getProducto_anterior() {
		return producto_anterior;
	}

	public void setProducto_anterior(ProductoEntity producto_anterior) {
		this.producto_anterior = producto_anterior;
	}

	public ProductoEntity getProducto() {
		return producto;
	}

	public void setProducto(ProductoEntity producto) {
		this.producto = producto;
	}

	public PedidoEntity getPedido() {
		return pedido;
	}

	public void setPedido(PedidoEntity pedido) {
		this.pedido = pedido;
	}
	
	
}
