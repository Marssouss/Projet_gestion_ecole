package com.intiformation.gestionecole.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="matieres")
public class Matiere implements Serializable{
	/* Propriétés */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_matiere")
	private long idMatiere;
	
	@Column(name="libelle")
	private String libelle;

	
	
	
	/* Constructeurs */
	//Constructeur vide 
	public Matiere() {
		
	} //end ctor vide

	//Constructeur chargé total
	public Matiere(long idMatiere, String libelle) {
		this.idMatiere = idMatiere;
		this.libelle = libelle;
	} //end ctor chargé total

	//Constructeur chargé sans ID
	public Matiere(String libelle) {
		this.libelle = libelle;
	} //end ctor chargé sans ID

	/* toString */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Matiere [idMatiere=" + idMatiere + ", " + (libelle != null ? "libelle=" + libelle : "") + "]";
	} //end toString

} //end class
