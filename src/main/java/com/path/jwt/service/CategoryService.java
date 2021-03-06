package com.path.jwt.service;

import com.path.jwt.entity.Category;

public interface CategoryService {
	
	public Iterable<Category> getAll();
	
	public Category add(Category category);
	
	public Category update(Category category);
	
	public Category get(Long id);
	
	public void delete(Long id);

}
