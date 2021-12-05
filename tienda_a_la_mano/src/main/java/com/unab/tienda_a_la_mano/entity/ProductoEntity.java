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
@Table(name = "Productos")
public class ProductoEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre",  length = 40, nullable = true)
	private String nombre;

	@Column(name = "precio", nullable = true)
	private Double precio;
	
	@Column(name = "impuesto", nullable = true)
	private Double impuesto;
	
	@Column(name = "cant_min", nullable = true)
	private Double cant_min;
	
	@Column(name = "puntos", nullable = true)
	private Double puntos;
	
	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "categoria_id", referencedColumnName = "id", nullable = true)
	private CategoriaEntity categoria;
	
	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "marca_id", referencedColumnName = "id", nullable = true)
	private MarcaEntity marca;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public Double getCant_min() {
		return cant_min;
	}

	public void setCant_min(Double cant_min) {
		this.cant_min = cant_min;
	}

	public Double getPuntos() {
		return puntos;
	}

	public void setPuntos(Double puntos) {
		this.puntos = puntos;
	}

	public CategoriaEntity getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEntity categoria) {
		this.categoria = categoria;
	}

	public MarcaEntity getMarca() {
		return marca;
	}

	public void setMarca(MarcaEntity marca) {
		this.marca = marca;
	}
	
	
}
