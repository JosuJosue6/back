package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Venta;
import com.example.demo.service.IVentaService;
import com.example.demo.service.to.VentaTO;

@CrossOrigin
@RestController
@RequestMapping(path = "/ventas")
public class VentaController {
	
	@Autowired
	private IVentaService ventaService;
	
	//http://localhost:8082/API/v1.0/Facturacion/ventas
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<VentaTO> guardar(@RequestBody Venta venta){
		this.ventaService.guardar(venta);
		HttpHeaders headers = new HttpHeaders();
		headers.add("mensaje_201", "Insercion");
		
		return new ResponseEntity<>(this.ventaService.convertir(venta),headers,201);
	}

}
