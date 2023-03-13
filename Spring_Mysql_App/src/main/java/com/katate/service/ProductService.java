package com.katate.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.katate.entity.Product;
import com.katate.repo.CategoryRepository;
import com.katate.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	// Returns a Product by searching it's ID
	public Product getProduct(int id) {
		return productRepository.findById(id).orElse(null);
	}
	
	// Returns all Products
	public List<Product> getAll(){
		return productRepository.findAll();
	}
	
	// Adds a Product given a Product name and price and CategoryId
	public int addProduct(String name, double price, int categoryId) {
		var product = new Product(name, price);
		var category = categoryRepository.findById(categoryId).orElse(null);
		product.setCategories(Arrays.asList(category));
		
		return productRepository.save(product).getId();
	}
}
