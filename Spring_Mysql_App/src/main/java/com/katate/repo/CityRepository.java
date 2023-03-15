package com.katate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.katate.entity.City;

public interface CityRepository extends JpaRepository<City, Integer>{
	
}