package com.rt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.rt.entities.Client;
import com.rt.repositories.ClientRepository;

@SpringBootApplication

public class BestserviceApplication implements CommandLineRunner  {
	
	@Autowired
	ClientRepository clientRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BestserviceApplication.class, args);	
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		clientRepository.save(new Client(null,"rami","rami","rhimi","rami@gmail.com",null));
		clientRepository.save(new Client(null,"tawfik","tawfik","maghraoui","tawfik@gmail.com",null));
		clientRepository.save(new Client(null,"bacem","bacem","bargaoui","bacem@gmail.com",null));
		clientRepository.save(new Client(null,"dali","dali","belajouza","dali@gmail.com",null));

	}

}
