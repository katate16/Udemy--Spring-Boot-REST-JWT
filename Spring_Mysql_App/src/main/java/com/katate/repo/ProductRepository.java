package com.katate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.katate.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
}