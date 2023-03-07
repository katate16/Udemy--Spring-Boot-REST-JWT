package com.project01.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project01.domain.Category;

@RestController
public class CategoryController {
	
	@RequestMapping(value = "categories/listCategory", method = RequestMethod.GET)
	public List<Category> listCategory() {
		var cat1 = new Category(1, "IT");
		var cat2 = new Category(2, "Office");
		
		List<Category> categories = Arrays.asList(cat1, cat2);
		return categories; 
	}
}
