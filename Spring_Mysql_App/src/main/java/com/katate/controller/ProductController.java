package com.katate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.katate.service.ProductService;

@Controller
@RequestMapping(path = "/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	// Add Product Endpoint
	@PostMapping(path = "/add")
	public ResponseEntity<?> addProduct(@RequestParam String name, @RequestParam double price, @RequestParam int categoryId) {
		return ResponseEntity.ok(productService.addProduct(name, price, categoryId));
	}
	
	// Get Product Endpoint
	@GetMapping(path = "/getProduct")
	public ResponseEntity<?> getProduct(@RequestParam int id) {
		var response = productService.getProduct(id);
		
		if(response != null) {
			return ResponseEntity.ok(response);			
		}
		return new ResponseEntity<>("Product not found.", HttpStatus.NOT_FOUND);
	}
	
	// Get All Products Endpoint
	@GetMapping(path = "/getAll")
	public ResponseEntity<?> getAllProducts(){
		return ResponseEntity.ok(productService.getAll());
	}
}
