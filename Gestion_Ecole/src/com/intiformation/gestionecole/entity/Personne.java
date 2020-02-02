package com.intiformation.gestionecole.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author IN-BR-015
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Personne implements Serializable {


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
	
	@OneToOne(cascade=CascadeType.ALL)//Ajout en cascade, suppr en cascade....
	@JoinColumn(name="adresse_id",referencedColumnName="id_adresse")//Gestion de la FK
//	@Column(name="adresse")
	protected Adresse adresse;

	/**
	 * Ctor vide
	 */
	public Personne() {

	}
	
	/**
	 * Ctor sans id
	 * @param identifiant
	 * @param motDePasse
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param adresse
	 */
	public Personne(String identifiant, String motDePasse, String nom, String prenom, String email, Adresse adresse) {
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
	}

	/**
	 * Ctor avec id
	 * @param idPersonne
	 * @param identifiant
	 * @param motDePasse
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param adresse
	 */
	public Personne(long idPersonne, String identifiant, String motDePasse, String nom, String prenom, String email,
			Adresse adresse) {
		this.idPersonne = idPersonne;
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
	}

	public long getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(long idPersonne) {
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

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", identifiant=" + identifiant + ", motDePasse=" + motDePasse
				+ ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", adresse=" + adresse + "]";
	}
	
	
	
	
	
} //end class
