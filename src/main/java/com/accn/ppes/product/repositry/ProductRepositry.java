package com.accn.ppes.product.repositry;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.accn.ppes.product.entity.Product;

public interface ProductRepositry extends MongoRepository<Product, Long> {

	
}
