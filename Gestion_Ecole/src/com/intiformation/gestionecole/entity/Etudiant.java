package com.intiformation.gestionecole.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Etudiants")
public class Etudiant extends Personne implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_etudiant")
	private long idEtudiant;

	/* Constructeurs */
	//Constructeur vide
	public Etudiant(String identifiant, String motDePasse, String nom, String prenom, String email) {
		super(identifiant, motDePasse, nom, prenom, email);
	} //end ctor vide

	//Constructeur chargé
	public Etudiant(long idEtudiant) {
		this.idEtudiant = idEtudiant;
	} //ctor chargé

	/* toString */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + "]";
	}	

} //end class
