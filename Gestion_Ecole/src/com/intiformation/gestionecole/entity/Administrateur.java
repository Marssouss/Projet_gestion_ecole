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

	public Administrateur() {
		super();
	}

	public Administrateur(long idPersonne, String identifiant, String motDePasse, String nom, String prenom,
			String email, Adresse adresse) {
		super(idPersonne, identifiant, motDePasse, nom, prenom, email, adresse);
	}

	public Administrateur(String identifiant, String motDePasse, String nom, String prenom, String email,
			Adresse adresse) {
		super(identifiant, motDePasse, nom, prenom, email, adresse);
	}

	@Override
	public String toString() {
		return "Administrateur [idPersonne=" + idPersonne + ", identifiant=" + identifiant + ", motDePasse="
				+ motDePasse + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", adresse=" + adresse
				+ "]";
	}

	
	
	
	

} //end class
