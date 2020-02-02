package com.intiformation.gestionecole.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="etudiants")
public class Etudiant extends Personne implements Serializable {
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="id_etudiant")
//	private long idEtudiant;
	
	@Column(name="photo")
	private String photo;
	
	@Column(name="date_de_naissance")
	@Temporal(TemporalType.DATE)
	private Date dateDeNaissance;

	/**
	 * Ctor vide
	 */
	public Etudiant() {

	}


	public Etudiant(String identifiant, String motDePasse, String nom, String prenom, String email, Adresse adresse,
			String photo, Date dateDeNaissance) {
		super(identifiant, motDePasse, nom, prenom, email, adresse);
		this.photo = photo;
		this.dateDeNaissance = dateDeNaissance;
	}
	
	public Etudiant(long idPersonne, String identifiant, String motDePasse, String nom, String prenom, String email,
			Adresse adresse, String photo, Date dateDeNaissance) {
		super(idPersonne, identifiant, motDePasse, nom, prenom, email, adresse);
		this.photo = photo;
		this.dateDeNaissance = dateDeNaissance;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}


	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}


	@Override
	public String toString() {
		return "Etudiant [photo=" + photo + ", dateDeNaissance=" + dateDeNaissance + ", idPersonne=" + idPersonne
				+ ", identifiant=" + identifiant + ", motDePasse=" + motDePasse + ", nom=" + nom + ", prenom=" + prenom
				+ ", email=" + email + ", adresse=" + adresse + "]";
	}

	
	
	

	
	
		
} //end class
