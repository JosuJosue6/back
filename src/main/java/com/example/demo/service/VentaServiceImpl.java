package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IVentaRepository;
import com.example.demo.repository.modelo.Venta;
import com.example.demo.service.to.VentaTO;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class VentaServiceImpl implements IVentaService{

	@Autowired
	private IVentaRepository iVentaRepository;
	
	@Override
	public void guardar(Venta venta) {
		// TODO Auto-generated method stub
		this.iVentaRepository.insertar(venta);
	}

	@Override
	public VentaTO convertir(Venta venta) {
		// TODO Auto-generated method stub
		
		VentaTO v = new VentaTO();
		v.setCedulaCliente(venta.getCedulaCliente());
		v.setNumeroVenta(venta.getNumero());;

		return v;
	}

	
	
}
