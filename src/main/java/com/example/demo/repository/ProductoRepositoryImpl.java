package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ProductoRepositoryImpl implements IProductoRepository {

	@Autowired
	private EntityManager entityManager;

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public Producto seleccionarPorBarras(String codigo) {
		// TODO Auto-generated method stub
		TypedQuery<Producto> myQuery = this.entityManager
				.createQuery("SELECT p FROM Producto p WHERE p.codigoBarras =:codigo ", Producto.class);
		myQuery.setParameter("codigo", codigo);
		try {
			return myQuery.getSingleResult();
		} catch (NoResultException e) {
			// TODO: handle exception
			return null;
		}
		
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}

}
