package com.nimap.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nimap.model.Product;
import com.nimap.repo.ProductRepo;
import com.nimap.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepo productRepo;

	@Override
	public Product saveProduct(Product product) {
		
		return productRepo.save(product);
	}

	@Override
	public Iterable<Product> getProduct() {
		
		return productRepo.findAll();
	}

	@Override
	public String deleteProduct(Integer id) {
		
		productRepo.deleteById(id);
		return "delete successfully";
	}

	@Override
	public Product getProductById(Integer id) {
		 productRepo.findById(id);
		return null;
		
		 
		 }
		
	}


