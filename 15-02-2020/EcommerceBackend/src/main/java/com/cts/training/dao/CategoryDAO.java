package com.cts.training.dao;

import java.util.List;

import com.cts.training.model.Category;

public interface CategoryDAO 
{
	public boolean saveOrUpdate(Category category);
	
	public boolean deleteCategory(Category category);
	
	public Category getCategoryById(int id);
	
	public List<Category> getAllCategories();
}
