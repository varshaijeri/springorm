package com.varsha.springcore.springorm.product.dao;

import java.util.List;

import com.varsha.springcore.springorm.product.model.Product;

public interface ProductDao {
	int create(Product product);

	void update(Product product);

	void delete(Product product);

	Product read(int id);

	List<Product> readAll();
}
