package com.intiformation.gestionecole.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="administrateurs")
public class Administrateur extends Personne implements Serializable {
	/* Propriétés */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_administrateur")
	private long idAdministrateur;
	
	/* Constructeurs */
	// Constructeur vide
	public Administrateur(String identifiant, String motDePasse, String nom, String prenom, String email) {
		super(identifiant, motDePasse, nom, prenom, email);
		// TODO Auto-generated constructor stub
	} //end ctor vide

	//Constructeur chargé
	public Administrateur(Long idPersonne, String identifiant, String motDePasse, String nom, String prenom,
			String email, long idAdministrateur) {
		super(idPersonne, identifiant, motDePasse, nom, prenom, email);
		this.idAdministrateur = idAdministrateur;
	}

	/* toString */
	@Override
	public String toString() {
		return "Administrateur [idAdministrateur=" + idAdministrateur + "]";
	}	

} //end class
