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
	
	@Column(name = "nombre",  length = 40, nullable = false)
	private String nombre;
	
	@Column(name = "direccion",  length = 40, nullable = false)
	private String direccion;
	
	@Column(name = "telefono",  length = 40, nullable = false)
	private String telefono;
	
	@Column(name = "cedula",  length = 40, nullable = false)
	private String cedula;
	
	@Column(name = "correo",  length = 40, nullable = false)
	private String correo;
	
	@Column(name = "clave",  length = 40, nullable = false)
	private String clave;
	
	@Column(name = "usuario",  length = 40, nullable = false)
	private String usuario;
	
	@Column(name = "estado",  length = 40, nullable = false)
	private String estado;
	

	@Column(name = "cantidad", nullable = false)
	private Double cantidad;
	
	@Column(name = "precio", nullable = false)
	private Double precio;
	
	@Column(name = "puntos", nullable = false)
	private Double puntos;
	
	@Column(name = "saldo", nullable = false)
	private Double saldo;
	
	@Column(name = "sesion", nullable = false)
	private Double sesion;
	
	@Column(name = "cupo", nullable = false)
	private Double cupo;
	
	@Column(name = "cuotas", nullable = false)
	private Double cuotas;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "rol_id", referencedColumnName = "id", nullable = false)
	private RolEntity rol;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "ciudad_id", referencedColumnName = "id", nullable = false)
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
