package com.intiformation.gestionecole.entity;

import java.io.Serializable;

import javax.faces.bean.SessionScoped;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="administrateurs")
@SessionScoped
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
	
	

	public Administrateur(Adresse adresse) {
		super(adresse);
	}

	@Override
	public String toString() {
		return "Administrateur [idPersonne=" + idPersonne + ", identifiant=" + identifiant + ", motDePasse="
				+ motDePasse + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", adresse=" + adresse
				+ "]";
	}

	
	
	
	

} //end class
