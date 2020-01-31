package com.intiformation.gestionecole.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="etudiants")
public class Etudiant extends Personne implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_etudiant")
	private long idEtudiant;
	
	@Column(name="photo")
	private String photo;
	
	@Column(name="date_de_naissance")
	private Date dateDeNaissance;

	/* Constructeurs */
	//Constructeur vide
	public Etudiant(String identifiant, String motDePasse, String nom, String prenom, String email) {
		super(identifiant, motDePasse, nom, prenom, email);
	} //end ctor vide

	//Constructeur chargé total
	public Etudiant(long idEtudiant, String photo, Date dateDeNaissance) {
		this.idEtudiant = idEtudiant;
		this.photo = photo;
		this.dateDeNaissance = dateDeNaissance;
	} //End ctor chargé total

	//Constructeur chargé sans ID
	public Etudiant(String photo, Date dateDeNaissance) {
		this.photo = photo;
		this.dateDeNaissance = dateDeNaissance;
	} //End ctor chargé sans ID

	/* toString */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + "]";
	}	

} //end class
