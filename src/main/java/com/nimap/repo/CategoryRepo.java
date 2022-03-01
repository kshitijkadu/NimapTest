package com.nimap.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nimap.model.Category;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Serializable>  {

}
