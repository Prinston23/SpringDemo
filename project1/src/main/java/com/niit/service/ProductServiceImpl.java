package com.niit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.ProductDao;
import com.niit.model.Product;
@Service
public class ProductServiceImpl implements ProductService{
   
	@Autowired
	private ProductDao productDao;
	
 
 public Product saveProduct(Product product) {
		
		return productDao.saveProduct(product);
	}

}
