package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Venta;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VentaRepositoryImpl implements IVentaRepository{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Venta venta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(venta);
	}

}
