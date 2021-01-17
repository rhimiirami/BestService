package com.rt.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.entities.Client;
import com.rt.service.ClientService;

@RestController
@RequestMapping("/api")
public class ClientResource {

	@Autowired
	private ClientService clientService;

	@GetMapping("/findAllClients")
	public List<Client> findAll() {
		return clientService.getAll();
	}

	@GetMapping("/findClientById/{id}")
	public Optional<Client> findClientById(@PathVariable Long id) {
		return clientService.getClientById(id);
	}

	@DeleteMapping("/deleteClientById/{id}")
	public void deleteClientById(@PathVariable Long id) {
		clientService.delete(id);

	}

}
