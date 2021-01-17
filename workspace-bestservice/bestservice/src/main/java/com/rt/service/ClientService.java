package com.rt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.entities.Client;
import com.rt.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	ClientRepository clientRepository;

	public List<Client> getAll() {
		return clientRepository.findAll();

	};

	public Optional<Client> getClientById(Long id) {
		return clientRepository.findById(id);

	}

	public void getClientUpdateById(Long id) {
		clientRepository.getClientUpdateById(id);

	}


	/*
	 * public void Update(@RequestBody Client client) { Client clients =
	 * getClientUpdateBy(id); client.setEmail(client.getEmail());
	 * 
	 * clientRepository.save(client); }
	 */

	public void delete(Long id) {
		clientRepository.deleteById(id);
	}

}
