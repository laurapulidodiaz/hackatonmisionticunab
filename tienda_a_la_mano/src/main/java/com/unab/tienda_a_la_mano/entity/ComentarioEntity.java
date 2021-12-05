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

@Entity
@Table(name = "Comentarios")
public class ComentarioEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "comentario",  length = 40, nullable = true)
	private String comentario;
	
	@Column(name = "fecha", nullable = true)
	private Date fecha;
	
	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "producto_id", referencedColumnName = "id", nullable = true)
	private ProductoEntity producto;
	
	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "cliente_id", referencedColumnName = "id", nullable = true)
	private ClienteEntity cliente;

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

	public ProductoEntity getProducto() {
		return producto;
	}

	public void setProducto(ProductoEntity producto) {
		this.producto = producto;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}
	
	
	
}
