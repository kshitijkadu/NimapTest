package com.nimap.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nimap.model.Product;
@Repository
public interface ProductRepo extends CrudRepository<Product,Serializable> {

}
