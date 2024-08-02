package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {
	
	@Id
	@SequenceGenerator(name = "seq_venta", sequenceName = "seq_venta",allocationSize = 1 )
	@GeneratedValue(generator = "seq_venta", strategy = GenerationType.SEQUENCE )
	@Column(name = "vent_id")
	private Integer id;

	@Column(name = "vent_numero")
	private String numero;
	
	@Column(name = "vent_cedula_cliente")
	private String cedulaCliente;
	
	@Column(name = "vent_total")
	private BigDecimal total;
	
	@OneToMany(mappedBy = "venta")
	private List<DetalleVenta> detalleVentas;

	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	
}
