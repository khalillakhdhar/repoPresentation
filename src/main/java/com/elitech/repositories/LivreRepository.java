package com.elitech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.model.entities.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long> {

}
