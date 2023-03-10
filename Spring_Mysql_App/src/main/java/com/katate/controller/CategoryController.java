package com.katate.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.katate.entity.Category;
import com.katate.repo.CategoryRepository;
import com.katate.service.CategoryService;

@Controller
@RequestMapping(path = "/category")
public class CategoryController {
	
	private CategoryService categoryService;
	
	
	@PostMapping(path = "/add")
	public @ResponseBody int addCategory(@RequestParam String name) {
		return categoryService.addCategory(name);
	}
	
	@GetMapping(path = "/getCategory")
	public @ResponseBody Category getCategory(@RequestParam int id) {
		return categoryService.getCategory(id);
	}
	
	@GetMapping(path = "/getAll")
	public @ResponseBody ArrayList<Category> getAllCategories(){
		return categoryService.getAll();
	}
}
