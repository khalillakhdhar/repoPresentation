package com.elitech.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.model.entities.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long> {
public  List<Livre> findByCategorie(String categorie);
public List<Livre>  findByTitre(String titre);
public List<Livre> findByPrixGreaterThan(double prix);
public List<Livre> findByPrixLessThan(double prix);
public List<Livre> findBySommaireContaining(String sommaire);
public List<Livre> findByPublication(boolean b);

}
