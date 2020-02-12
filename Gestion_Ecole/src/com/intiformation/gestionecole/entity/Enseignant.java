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

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignant(long idPersonne, String identifiant, String motDePasse, String nom, String prenom, String email,
			Adresse adresse) {
		super(idPersonne, identifiant, motDePasse, nom, prenom, email, adresse);
		// TODO Auto-generated constructor stub
	}

	public Enseignant(String identifiant, String motDePasse, String nom, String prenom, String email, Adresse adresse) {
		super(identifiant, motDePasse, nom, prenom, email, adresse);
		// TODO Auto-generated constructor stub
	}
	
	

	public Enseignant(Adresse adresse) {
		super(adresse);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Enseignant [idPersonne=" + idPersonne + ", identifiant=" + identifiant + ", motDePasse=" + motDePasse
				+ ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", adresse=" + adresse + "]";
	}

	
	
	
	
	

}
