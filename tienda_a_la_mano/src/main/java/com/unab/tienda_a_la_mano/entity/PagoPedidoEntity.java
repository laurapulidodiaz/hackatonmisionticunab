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
@Table(name = "PagoPedidos")
public class PagoPedidoEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "valor_pago", nullable = true)
	private Double valor_pago;
	
	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "medio_pago_id", referencedColumnName = "id", nullable = true)
	private MedioPagoEntity medio_pago;
	
	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "pedido_id", referencedColumnName = "id", nullable = true)
	private PedidoEntity pedido;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValor_pago() {
		return valor_pago;
	}

	public void setValor_pago(Double valor_pago) {
		this.valor_pago = valor_pago;
	}

	public MedioPagoEntity getMedio_pago() {
		return medio_pago;
	}

	public void setMedio_pago(MedioPagoEntity medio_pago) {
		this.medio_pago = medio_pago;
	}

	public PedidoEntity getPedido() {
		return pedido;
	}

	public void setPedido(PedidoEntity pedido) {
		this.pedido = pedido;
	}
	
	
	
	
	

}
