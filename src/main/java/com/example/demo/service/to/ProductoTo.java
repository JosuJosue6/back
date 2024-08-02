package com.example.demo.service.to;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProductoTo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String codigoBarras;
	
	private String nombre;
	
	private String categoria;
	
	private Integer stock;
	
	private BigDecimal precioUnitario;

	//SET Y GET 
	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	
	
}
