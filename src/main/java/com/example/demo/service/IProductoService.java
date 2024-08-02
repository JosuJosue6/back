package com.example.demo.service;

import com.example.demo.repository.modelo.Producto;
import com.example.demo.service.to.ProductoTo;

public interface IProductoService {
	
	public void guardar(Producto producto);
	public ProductoTo convertir (Producto producto);
	public Producto buscar (String barra);
}
