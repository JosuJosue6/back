package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_venta")
public class DetalleVenta {
	
	@Id
	@SequenceGenerator(name = "seq_detalle_venta", sequenceName = "seq_detalle_venta", allocationSize = 1 )
	@GeneratedValue(generator = "seq_detalle_venta", strategy = GenerationType.SEQUENCE )
	@Column(name = "deta_id")
	private Integer id;

	@Column(name = "deta_")
	private Integer cantidad;
	
	@Column(name = "deta_precio_unitario")
	private BigDecimal precioUnitario;
	
	@Column(name = "deta_subtotal")
	private BigDecimal subtotal;
	
	@ManyToOne
	@JoinColumn(name = "deta_id_venta")
	private Venta venta;
	
	@ManyToOne
	@JoinColumn(name = "deta_id_producto")
	private Producto producto;

	
	//SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public Venta getIdVenta() {
		return venta;
	}

	public void setIdVenta(Venta idVenta) {
		this.venta = idVenta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	
	
	
	
}
