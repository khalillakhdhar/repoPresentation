package com.elitech;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.elitech.model.entities.Employee;
import com.elitech.repositories.EmployeeRepository;

@SpringBootApplication
public class RepoPresentationApplication implements CommandLineRunner{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RepoPresentationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee em1=new Employee("user1","user1", "mymail1", "mypass1", "20111111", 30);
		Employee em2=new Employee("user2","user2", "mymail2", "mypass2", "20222222", 30);
		// ajout
		Employee employee1= employeeRepository.save(em1);
		Employee employee2=employeeRepository.save(em2);
		employee1.setPrenom("updated user1");
		employeeRepository.save(employee1);
		List<Employee> employees=employeeRepository.findAll();
		System.out.println("affichages");
		employees.forEach(System.out::println);
		
		
	}

}
