package com.nimap.service;

import java.util.Optional;

import com.nimap.model.Product;

public interface ProductService {
//kk
	public Product saveProduct(Product product);

	public Iterable<Product> getProduct();
	public String deleteProduct(Integer id);
	public  Product getProductById(Integer Id);
	

}
