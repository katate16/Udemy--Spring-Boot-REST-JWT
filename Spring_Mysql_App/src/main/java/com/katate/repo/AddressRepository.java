package com.katate.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.katate.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{
	
}