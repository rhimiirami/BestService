package com.rt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rt.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {


}
