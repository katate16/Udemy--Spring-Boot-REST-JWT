package com.katate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.katate.service.ClientService;

@Controller
@RequestMapping(path = "/client")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@GetMapping(path = "/getClient")
	public ResponseEntity<?> getClient(@RequestParam int id) {
		return ResponseEntity.ok(clientService.getClient(id));
	}

}
