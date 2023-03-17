package com.katate.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.katate.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
	
}