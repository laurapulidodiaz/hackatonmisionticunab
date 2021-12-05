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
@Table(name = "Tiendas")
public class TiendaEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre",  length = 40, nullable = true)
	private String nombre;
	
	@Column(name = "direccion",  length = 40, nullable = true)
	private String direccion;
	
	@Column(name = "telefono",  length = 40, nullable = true)
	private String telefono;
	
	@Column(name = "coordenadas",  length = 40, nullable = true)
	private String coordenadas;
	
	@Column(name = "facebook",  length = 40, nullable = true)
	private String facebook;
	
	@Column(name = "twitter",  length = 40, nullable = true)
	private String twitter;
	
	@Column(name = "instagram",  length = 40, nullable = true)
	private String instagram;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ciudad_id", referencedColumnName = "id", nullable = true)
	private CiudadEntity ciudad;

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public CiudadEntity getCiudad() {
		return ciudad;
	}

	public void setCiudad(CiudadEntity ciudad) {
		this.ciudad = ciudad;
	}
	
	
	

}
