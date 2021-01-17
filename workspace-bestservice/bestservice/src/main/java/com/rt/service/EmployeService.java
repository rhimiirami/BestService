package com.rt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rt.entities.Employe;
import com.rt.repositories.EmployeRepository;

@Service
public class EmployeService {

	@Autowired
	EmployeRepository employeRepository;

	
    public Employe createEmploye( Employe newEmploye) {
        return employeRepository.save(newEmploye);
    }
	
	public List<Employe> getAllEmploye() {
		return employeRepository.findAll();
	}


	public Optional<Employe> getEmployeById(Long id) {
		return employeRepository.findById(id);
	}
	
	public Employe getEmployeByIdDemo(Long id) {
		return employeRepository.findById(id).get();
	}

	public void delete(Long id) {
		employeRepository.deleteById(id);
	}

	public void update(Long id, Employe employe) {

		Optional<Employe> employes = getEmployeById(id);

		Employe employeData = employes.get();
		employeData.setEmail(employe.getEmail());
		employeData.setFirstName(employe.getFirstName());
		employeData.setLastName(employe.getLastName());
		employeData.setImageUrl(employe.getImageUrl());

		employeRepository.save(employeData);

	}
	

}
