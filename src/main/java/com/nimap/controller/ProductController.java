package com.nimap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nimap.model.Product;
import com.nimap.repo.ProductRepo;
import com.nimap.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	
	@Autowired
	ProductService productService;
	
       @PostMapping("/saveProduct")
	public String insertProduct(@RequestBody Product product ) {
    	  
    	   productService.saveProduct(product);
		return "product insert successful";
		
	}
       @GetMapping("/get")
       public @ResponseBody Iterable<Product> getProduct( Product product ) {
     	  
 	     
		return  productService.getProduct();
		
	}
       @DeleteMapping("/delete/{id}")
       public String deleteProductbyId(@PathVariable("id") int id,@RequestBody Product product) {
    	   
    	   return productService.deleteProduct(id);
    	   
       }
       @PutMapping("/update/{id}")
       public Product updateProduct(@PathVariable("id") int id,@RequestBody Product product) {
    	  Product product2 = productService.getProductById(id);
    	  product2.setProductId(product.getProductId());
    	  product2.setProductName(product.getProductName());
    	  product2.setProductDescription(product.getProductDescription());
    	  Product product3= productService.saveProduct(product2);
		  return product3;
    	   
       }
     
	
}
