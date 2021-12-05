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
@Table(name = "Kardex")
public class KardexEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "fecha",  length = 40, nullable = true)
	private Date fecha;	
	
	@Column(name = "stock",  length = 40, nullable = true)
	private Double stock;
	
	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "tienda_id", referencedColumnName = "id", nullable = true)
	private TiendaEntity tienda;
	
	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "producto_id", referencedColumnName = "id", nullable = true)
	private ProductoEntity producto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getStock() {
		return stock;
	}

	public void setStock(Double stock) {
		this.stock = stock;
	}

	public TiendaEntity getTienda() {
		return tienda;
	}

	public void setTienda(TiendaEntity tienda) {
		this.tienda = tienda;
	}

	public ProductoEntity getProducto() {
		return producto;
	}

	public void setProducto(ProductoEntity producto) {
		this.producto = producto;
	}
	
	
	

}
