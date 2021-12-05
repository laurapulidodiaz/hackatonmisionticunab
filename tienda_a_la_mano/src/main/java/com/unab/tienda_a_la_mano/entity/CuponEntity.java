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
@Table(name = "Cupones")
public class CuponEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descripcion",  length = 40, nullable = true)
	private String descripcion;
	
	@Column(name = "tipo",  length = 40, nullable = true)
	private String tipo;	
	
	@Column(name = "estado",  length = 40, nullable = true)
	private String estado;
	
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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
