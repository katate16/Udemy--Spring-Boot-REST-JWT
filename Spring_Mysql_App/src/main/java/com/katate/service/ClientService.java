package com.katate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.katate.entity.Client;
import com.katate.repo.ClientRepository;
import com.katate.service.exceptions.ObjectNotFoundException;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository; 
	
	//Return a Client given it's id
	public Client getClient(int id) {
		var client = clientRepository.findById(id).orElse(null);
		
		if(client == null) {
			throw new ObjectNotFoundException("Client not found.");
		}
		return client;
	}
}
