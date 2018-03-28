package com.accn.ppes.product.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Product {
	@Id
    public Long id;

    public String name;
    

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product() {}

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Product[id=%s, name='%s']",
                id, name);
    }

}
