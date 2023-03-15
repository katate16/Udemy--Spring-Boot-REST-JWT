package com.katate.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.katate.entity.State;


public interface StateRepository extends JpaRepository<State, Integer>{
	
}