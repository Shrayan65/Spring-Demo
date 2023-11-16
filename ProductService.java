package com.Store.Store.services;

import java.util.List;

import com.Store.Store.entities.Product;

public interface ProductService {

	public List<Product> getProducts();
	public Product getProduct(long productId);
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public void deleteProduct(long parseLong);
	}
