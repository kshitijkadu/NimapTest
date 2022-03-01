package com.nimap.service;



import com.nimap.model.Category;

//kk
public interface CategoryService {
	
public Category saveCategory(Category category);
public Iterable<Category> getCategory();
public String deleteCategory(Integer id);
public  Category getCategoryById(Integer Id);


}
