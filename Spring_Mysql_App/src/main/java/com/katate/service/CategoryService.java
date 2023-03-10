package com.katate.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.katate.entity.*;
import com.katate.repo.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public Category getCategory(int id) {
		return categoryRepository.findById(id).orElse(null);
	}

	public ArrayList<Category> getAll() {
		ArrayList<Category> result = new ArrayList<Category>();
		Iterable<Category> it = categoryRepository.findAll();
		it.forEach(result::add);
		
		return result;
	}
	
	public int addCategory(String name) {
		return categoryRepository.save(new Category(name)).getId();
	}
	
}
