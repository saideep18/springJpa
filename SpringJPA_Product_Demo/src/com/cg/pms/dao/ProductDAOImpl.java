package com.cg.pms.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.pms.model.Product;

@Repository
public class ProductDAOImpl implements IProductDAO {

	@PersistenceContext
	EntityManager manager;
		
	@Override
	public void registerProduct(Product product) {
		// TODO Auto-generated method stub
		manager.persist(product);
		
	}
	
	

}
