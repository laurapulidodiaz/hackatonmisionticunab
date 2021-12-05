package com.unab.tienda_a_la_mano.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "TarifaEnvios")
public class TarifaEnvioEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descripcion",  length = 40, nullable = true)
	private String descripcion;
	
	@Column(name = "valor", nullable = true)
	private Double valor;
	
	@Column(name = "cant_min", nullable = true)
	private Double cant_min;
	
	@Column(name = "cant_max", nullable = true)
	private Double cant_max;
	
	@Column(name = "precio_min", nullable = true)
	private Double precio_min;
	
	@Column(name = "precio_max", nullable = true)
	private Double precio_max;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getCant_min() {
		return cant_min;
	}

	public void setCant_min(Double cant_min) {
		this.cant_min = cant_min;
	}

	public Double getCant_max() {
		return cant_max;
	}

	public void setCant_max(Double cant_max) {
		this.cant_max = cant_max;
	}

	public Double getPrecio_min() {
		return precio_min;
	}

	public void setPrecio_min(Double precio_min) {
		this.precio_min = precio_min;
	}

	public Double getPrecio_max() {
		return precio_max;
	}

	public void setPrecio_max(Double precio_max) {
		this.precio_max = precio_max;
	}
	
	
}
