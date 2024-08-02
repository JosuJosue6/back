package com.example.demo.service.to;

import java.util.List;

import com.example.demo.repository.modelo.Producto;

public class VentaTO {
	
	private String numeroVenta;
	
	private String cedulaCliente;
	
	private List<Producto> productos;
	
	//SET Y GET

	public String getNumeroVenta() {
		return numeroVenta;
	}

	public void setNumeroVenta(String codigoBarras) {
		this.numeroVenta = codigoBarras;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}
