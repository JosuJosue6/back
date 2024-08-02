package com.example.demo.repository;

import com.example.demo.repository.modelo.Producto;

public interface IProductoRepository {
	
	public void insertar(Producto producto);
	
	public Producto seleccionarPorBarras(String codigo);
	
	public void actualizar(Producto producto);
}
