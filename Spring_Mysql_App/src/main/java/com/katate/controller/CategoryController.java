package com.katate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.katate.service.CategoryService;

@Controller
@RequestMapping(path = "/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	// Add Category Endpoint
	@PostMapping(path = "/add")
	public ResponseEntity<?> addCategory(@RequestParam String name) {
		return ResponseEntity.ok(categoryService.addCategory(name));
	}

	// Get Category Endpoint
	@GetMapping(path = "/getCategory")
	public ResponseEntity<?> getCategory(@RequestParam int id) {
		return ResponseEntity.ok(categoryService.getCategory(id));
	}

	// Get All Categories Endpoint
	@GetMapping(path = "/getAll")
	public ResponseEntity<?> getAllCategories() {
		return ResponseEntity.ok(categoryService.getAll());
	}

	// Get Products by Category Id
	@GetMapping(path = "/getProductsByCategoryId")
	public ResponseEntity<?> getProductsByCategoryId(@RequestParam int id) {
		return ResponseEntity.ok(null);
	}
}
