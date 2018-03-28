package com.accn.ppes.product.service;

import com.accn.ppes.product.entity.Product;

public interface ProductService {
	
	Product findById(Long id);
	Product save(Product product);

}
