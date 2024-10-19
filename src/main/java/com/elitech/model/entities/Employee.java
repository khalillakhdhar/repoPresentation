package com.elitech.model.entities;

import java.time.LocalDateTime;

import com.elitech.model.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends BaseEntity {
	@Column(nullable = false)
private String nom;
	@Column(nullable = false)
private String prenom;
	@Column(nullable = false,unique = true)
private String email;
	@Column(nullable = false)
private String password;
	@Column(nullable = false,unique = true)
private String telephone;
	@Column(nullable = false)
private int age;

	
	
	
}
