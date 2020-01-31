package com.intiformation.gestionecole.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personnes")
public class Personne implements Serializable {
	/* Propriétés */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_personne")
	protected long idPersonne;
	
	@Column(name="identifiant")
	protected String identifiant;
	
	@Column(name="motdepasse")
	protected String motDePasse;
	
	@Column(name="nom")
	protected String nom; 
	
	@Column(name="prenom")
	protected String prenom;
	
	@Column(name="email")
	protected String email;

	/* Constructeurs */
	//Constructeur vide
	public Personne() {
		
	} //End ctor vide

	//Constructeur avec tous les champs
	public Personne(Long idPersonne, String identifiant, String motDePasse, String nom, String prenom, String email) {
		this.idPersonne = idPersonne;
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	} //end ctor total

	//Constructeur sans ID
	public Personne(String identifiant, String motDePasse, String nom, String prenom, String email) {
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	} //end ctor sans ID

	/* Getters & Setters */
	public Long getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(Long idPersonne) {
		this.idPersonne = idPersonne;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/* toString */
	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", identifiant=" + identifiant + ", motDePasse=" + motDePasse
				+ ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + "]";
	} //end toString

} //end class
