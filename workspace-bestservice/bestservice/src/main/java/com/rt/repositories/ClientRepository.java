package com.rt.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rt.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{


	
    @Query(value = "select * from client where id=:id",nativeQuery = true)
    public Client  getClientUpdateById (@Param("id") Long id);
	
	
}
