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
@Table(name = "Pedidos")
public class PedidoEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "fecha", nullable = true)
	private Date fecha;
	
	@Column(name = "costo_envio", nullable = true)
	private Double costo_envio;
	
	@Column(name = "pago_entrega", nullable = true)
	private Double pago_entrega;
	
	@Column(name = "total_pedido", nullable = true)
	private Double total_pedido;
	
	@Column(name = "total_impuesto", nullable = true)
	private Double total_impuesto;
	
	@Column(name = "total_descuento", nullable = true)
	private Double total_descuento;
	
	@Column(name = "estado",  length = 40, nullable = true)
	private String estado;
	
	@Column(name = "observacion",  length = 40, nullable = true)
	private String observacion;
	
	@Column(name = "calificacion", nullable = true)
	private Double calificacion;
	
	@Column(name = "tipo_entrega",  length = 40, nullable = true)
	private String tipo_entrega;
	
	@Column(name = "hora_entrega",  length = 40, nullable = true)
	private String hora_entrega;

	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "cliente_id", referencedColumnName = "id", nullable = true)
	private ClienteEntity cliente;
	
	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "tienda_id", referencedColumnName = "id", nullable = true)
	private TiendaEntity tienda;
	
	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "domiciliario_id", referencedColumnName = "id", nullable = true)
	private DomiciliarioEntity domiciliario;
	
	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "rango_entrega_id", referencedColumnName = "id", nullable = true)
	private RangoEntregaEntity rango_entrega;

	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "tarifa_envio_id", referencedColumnName = "id", nullable = true)
	private TarifaEnvioEntity tarifa_envio;

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

	public Double getCosto_envio() {
		return costo_envio;
	}

	public void setCosto_envio(Double costo_envio) {
		this.costo_envio = costo_envio;
	}

	public Double getPago_entrega() {
		return pago_entrega;
	}

	public void setPago_entrega(Double pago_entrega) {
		this.pago_entrega = pago_entrega;
	}

	public Double getTotal_pedido() {
		return total_pedido;
	}

	public void setTotal_pedido(Double total_pedido) {
		this.total_pedido = total_pedido;
	}

	public Double getTotal_impuesto() {
		return total_impuesto;
	}

	public void setTotal_impuesto(Double total_impuesto) {
		this.total_impuesto = total_impuesto;
	}

	public Double getTotal_descuento() {
		return total_descuento;
	}

	public void setTotal_descuento(Double total_descuento) {
		this.total_descuento = total_descuento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}

	public String getTipo_entrega() {
		return tipo_entrega;
	}

	public void setTipo_entrega(String tipo_entrega) {
		this.tipo_entrega = tipo_entrega;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public TiendaEntity getTienda() {
		return tienda;
	}

	public void setTienda(TiendaEntity tienda) {
		this.tienda = tienda;
	}

	public DomiciliarioEntity getDomiciliario() {
		return domiciliario;
	}

	public void setDomiciliario(DomiciliarioEntity domiciliario) {
		this.domiciliario = domiciliario;
	}

	public RangoEntregaEntity getRango_entrega() {
		return rango_entrega;
	}

	public void setRango_entrega(RangoEntregaEntity rango_entrega) {
		this.rango_entrega = rango_entrega;
	}

	public TarifaEnvioEntity getTarifa_envio() {
		return tarifa_envio;
	}

	public void setTarifa_envio(TarifaEnvioEntity tarifa_envio) {
		this.tarifa_envio = tarifa_envio;
	}
	
	public String getHora_entrega() {
		return hora_entrega;
	}

	public void setHora_entrega(String hora_entrega) {
		this.hora_entrega = hora_entrega;
	}
	
	

}
