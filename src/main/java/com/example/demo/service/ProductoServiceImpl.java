package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IProductoRepository;
import com.example.demo.repository.modelo.Producto;
import com.example.demo.service.to.ProductoTo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoRepository productoRepository;

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		
		Producto validado = this.validacion(producto.getCodigoBarras());
		
		if (validado==null) {
			this.productoRepository.insertar(producto);
		}else {	
			validado.setStock(validado.getStock()+producto.getStock());
			this.productoRepository.actualizar(validado);
		}
		
	}

	public ProductoTo convertir (Producto producto) {
		ProductoTo productoTo = new ProductoTo();
		productoTo.setCategoria(producto.getCategoria());
		productoTo.setCodigoBarras(producto.getCodigoBarras());
		productoTo.setNombre(producto.getNombre());
		productoTo.setPrecioUnitario(producto.getPrecio());
		//productoTo.setStock(producto.getStock());
		return productoTo;
	}
	
	private Producto validacion (String codigo) {
		Producto encontrado = this.productoRepository.seleccionarPorBarras(codigo);
		/*if (encontrado!= null) {
			return encontrado;
		}else {
			return null;
		}*/
		
		return (encontrado != null) ? encontrado :null;
	}
	
	private void stock(String barras, Integer cantidad) {
		Producto p = this.productoRepository.seleccionarPorBarras(barras);
		Integer stockActual = p.getStock();
		if(stockActual<cantidad || stockActual == 0) {
			System.out.println("No discponible");
		}else {
			stockActual = stockActual-cantidad;
			p.setStock(stockActual);
			this.productoRepository.actualizar(p);
		}
	}

	@Override
	public Producto buscar(String barra) {
		// TODO Auto-generated method stub
		return this.productoRepository.seleccionarPorBarras(barra);
	}
	
}
