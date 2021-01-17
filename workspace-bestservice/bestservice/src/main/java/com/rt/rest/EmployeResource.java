package com.rt.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.entities.Employe;
import com.rt.repositories.EmployeRepository;
import com.rt.service.EmployeService;

@RestController
@RequestMapping("/api")
public class EmployeResource {


	@Autowired
	EmployeService employeService;

	@PostMapping("/createEmploye")
    Employe createEmploye(@RequestBody Employe employe) {
        return employeService.createEmploye(employe);
    }
	
	@GetMapping("/getAllEmployes")
	public List<Employe> getAll() {
		return employeService.getAllEmploye();
	}

	@GetMapping("/getEmployeById/{id}")
	public Optional<Employe> getfindEmployeById(@PathVariable Long id) {
		return employeService.getEmployeById(id);
	}
	
	@GetMapping("/getEmployeByIdDemo/{id}")
	public Employe getEmployeByIdDemo(@PathVariable Long id) {
		return employeService.getEmployeByIdDemo(id);
	}

	@DeleteMapping("/deleteEmployeById/{id}")
	public void deleteEmployeById(@PathVariable Long id) {
		employeService.delete(id);
	}
	
    /*update Optional*/
	@PutMapping("/updateEmploye/{id}")
	public void update(@PathVariable Long id, @RequestBody Employe employe) {
		employeService.update(id, employe);
	}
	
}
