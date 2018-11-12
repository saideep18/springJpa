package com.cg.pms.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.pms.dao.IProductDAO;
import com.cg.pms.model.Product;
@Service
@Transactional
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	IProductDAO productDao;

	@Override
	public void registerProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.registerProduct(product);
		
	}
	
	

}
