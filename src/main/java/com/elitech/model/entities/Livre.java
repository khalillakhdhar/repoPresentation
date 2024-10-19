package com.elitech.model.entities;

import com.elitech.model.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
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
public class Livre extends BaseEntity {
@Column(nullable = false)
private String titre;
@Column(nullable = false)
@Lob
private String sommaire;

private boolean publication;
@Column(nullable = false)

private String categorie;
@Column(nullable = false)
private double prix;
}
