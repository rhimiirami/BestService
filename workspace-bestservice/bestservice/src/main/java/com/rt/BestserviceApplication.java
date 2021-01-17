package com.rt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rt.entities.Client;
import com.rt.entities.Employe;
import com.rt.repositories.ClientRepository;
import com.rt.repositories.EmployeRepository;

@SpringBootApplication

public class BestserviceApplication implements CommandLineRunner {

	@Autowired
	ClientRepository clientRepository;

	@Autowired
	EmployeRepository employeRepository;

	public static void main(String[] args) {
		SpringApplication.run(BestserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		employeRepository.save(new Employe(null, "rami", "rhimi", "rami@gmail.com", null));
		employeRepository.save(new Employe(null, "tawfik", "maghraoui", "tawfik@gmail.com", null));

		clientRepository.save(new Client(null, "rami", "rami", "rhimi", "rami@gmail.com", null));
		clientRepository.save(new Client(null, "tawfik", "tawfik", "maghraoui", "tawfik@gmail.com", null));
		clientRepository.save(new Client(null, "bacem", "bacem", "bargaoui", "bacem@gmail.com", null));
		clientRepository.save(new Client(null, "dali", "dali", "belajouza", "dali@gmail.com", null));

	}

}
