package com.example.demo.service;

import com.example.demo.repository.modelo.Venta;
import com.example.demo.service.to.VentaTO;

public interface IVentaService {
	
	public void guardar(Venta venta);
	
	public VentaTO convertir (Venta venta);

}
