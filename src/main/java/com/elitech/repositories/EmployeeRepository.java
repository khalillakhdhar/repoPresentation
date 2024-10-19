package com.elitech.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.model.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	public List<Employee> findByTelephone(String telephone);
	public List<Employee> findByNomOrPrenom(String nom,String prenom);

}
