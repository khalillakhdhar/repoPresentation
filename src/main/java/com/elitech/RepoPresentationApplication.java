package com.elitech;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.elitech.model.entities.Employee;
import com.elitech.model.entities.Livre;
import com.elitech.repositories.EmployeeRepository;
import com.elitech.repositories.LivreRepository;

@SpringBootApplication
public class RepoPresentationApplication implements CommandLineRunner{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private LivreRepository livreRepository;
	public static void main(String[] args) {
		SpringApplication.run(RepoPresentationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee em1=new Employee("user1","user1", "mymail1", "mypass1", "20111111", 30);
		Employee em2=new Employee("user2","user2", "mymail2", "mypass2", "20222222", 30);
		// ajout
		Livre livre=new Livre("le grand cahier", "livre de deux jumaux durant la GM2", true, "Roman", 40000);
		livreRepository.save(livre);
		Employee employee1= employeeRepository.save(em1);
		Employee employee2=employeeRepository.save(em2);
		employee1.setPrenom("updated user1");
		employeeRepository.save(employee1);
		List<Employee> employees=employeeRepository.findAll();
		System.out.println("affichages");
//parcours(employees);
parcourir(livreRepository.findAll());
//employeeRepository.deleteById((long) 2);
System.out.println("recherche par tel:");

//parcours(employees);


	parcours(employeeRepository.findByTelephone("20222222"));
	
	System.out.println("recherche par nom ou prenom:");
	parcours(employeeRepository.findByNomOrPrenom("user2", "updated user1"));
	
	}
	public void parcours(List<Employee> maliste)
	
	{
	maliste.forEach(System.out::println);	
	}
public void parcourir(List<Livre> maliste)
	
	{
	maliste.forEach(System.out::println);	
	}

}
