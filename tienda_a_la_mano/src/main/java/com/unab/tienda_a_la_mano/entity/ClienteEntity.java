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

@Entity
@Table(name = "Clientes")
public class ClienteEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre",  length = 40, nullable = true)
	private String nombre;
	
	@Column(name = "telefono",  length = 40, nullable = true)
	private String telefono;
	
	@Column(name = "cedula",  length = 40, nullable = true)
	private String cedula;
	
	@Column(name = "correo",  length = 40, nullable = true)
	private String correo;
	
	@Column(name = "clave",  length = 40, nullable = true)
	private String clave;
	
	@Column(name = "usuario",  length = 40, nullable = true)
	private String usuario;
	
	@Column(name = "estado",  length = 40, nullable = true)
	private String estado;
	
	@Column(name = "puntos", nullable = true)
	private Double puntos;
	
	@Column(name = "saldo", nullable = true)
	private Double saldo;
	
	@Column(name = "sesion", nullable = true)
	private Double sesion;
	
	@Column(name = "cupo", nullable = true)
	private Double cupo;
	
	@Column(name = "cuotas", nullable = true)
	private Double cuotas;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "rol_id", referencedColumnName = "id", nullable = true)
	private RolEntity rol;
	
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
	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Double getPuntos() {
		return puntos;
	}

	public void setPuntos(Double puntos) {
		this.puntos = puntos;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSesion() {
		return sesion;
	}

	public void setSesion(Double sesion) {
		this.sesion = sesion;
	}

	public Double getCupo() {
		return cupo;
	}

	public void setCupo(Double cupo) {
		this.cupo = cupo;
	}

	public Double getCuotas() {
		return cuotas;
	}

	public void setCuotas(Double cuotas) {
		this.cuotas = cuotas;
	}

	public RolEntity getRol() {
		return rol;
	}

	public void setRol(RolEntity rol) {
		this.rol = rol;
	}

	public CiudadEntity getCiudad() {
		return ciudad;
	}

	public void setCiudad(CiudadEntity ciudad) {
		this.ciudad = ciudad;
	}
	
	

}
