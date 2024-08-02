package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Producto;
import com.example.demo.service.IProductoService;
import com.example.demo.service.to.ProductoTo;

@CrossOrigin
@RestController
@RequestMapping(path = "/productos")
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;
	
	
	//http://localhost:8082/API/v1.0/Facturacion/productos
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProductoTo> guardar(@RequestBody Producto producto) {
		this.productoService.guardar(producto);
		HttpHeaders headers = new HttpHeaders();
		headers.add("mensaje_201", "Insercion de un recurso");
		return new ResponseEntity<>(this.productoService.convertir(producto),headers,201);
	}
	
	//http://localhost:8082/API/v1.0/Facturacion/productos/
	@GetMapping(path = "/{barras}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProductoTo> buscar(@PathVariable String barras) {
		//this.productoService.buscar(barras);
		HttpHeaders headers = new HttpHeaders();
		headers.add("mensaje_203", "Obtencion de un recurso");
		return new ResponseEntity<>(this.productoService.convertir(this.productoService.buscar(barras)),headers,201);
	}

}
