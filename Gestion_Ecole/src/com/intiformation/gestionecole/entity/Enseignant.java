package com.intiformation.gestionecole.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="enseignants")
public class Enseignant extends Personne implements Serializable {
	/* Propriétés */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idEnseignant;

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* Constructeurs */
	//Constructeur vide
	public Enseignant(String identifiant, String motDePasse, String nom, String prenom, String email) {
		super(identifiant, motDePasse, nom, prenom, email);

	} //end ctor vide

	//Constructeur chargé
	public Enseignant(long idEnseignant) {
		this.idEnseignant = idEnseignant;
	} //end ctor chargé

	/* Getters & Setters */
	public long getIdEnseignant() {
		return idEnseignant;
	}

	public void setIdEnseignant(long idEnseignant) {
		this.idEnseignant = idEnseignant;
	}

	/* toString */
	@Override
	public String toString() {
		return "Enseignant [idEnseignant=" + idEnseignant + "]";
	} //end toString

}
