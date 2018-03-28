package com.accn.ppes.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accn.ppes.product.entity.Product;
import com.accn.ppes.product.repositry.ProductRepositry;

@Service
public class ProductServiceUtility implements ProductService {

	@Autowired
	private ProductRepositry repositry;
	
	public Product findById(Long id) {

		return repositry.findOne(id);
	}

	public Product save(Product product) {

		return repositry.save(product);
	}
}
