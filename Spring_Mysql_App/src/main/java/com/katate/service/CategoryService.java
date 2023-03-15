package com.katate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.katate.entity.*;
import com.katate.repo.CategoryRepository;
import com.katate.service.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	
	// Returns a Category by searching it's ID
	public Category getCategory(int id) {
		var result = categoryRepository.findById(id).orElse(null);
		if(result == null) {
			throw new ObjectNotFoundException("Category not found.");
		}
		return result; 
	}

	// Returns all Categories
	public List<Category> getAll() {
		return categoryRepository.findAll();
	}
	
	// Adds a Category given a Category name
	public int addCategory(String name) {
		return categoryRepository.save(new Category(name)).getId();
	}
}
