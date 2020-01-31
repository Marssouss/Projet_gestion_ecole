package com.intiformation.gestionecole.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adresse")
public class Adresse {
	/* Propriétés */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_adresse")
	private long idAdresse;
	
	@Column(name="rue")
	private String rue;
	
	@Column(name="code_postal")
	private int codePostal;
	
	@Column(name="ville")
	private String ville;

	/* Constructeurs */
	//Constructeur vide
	public Adresse() {
		
	} //end ctor vide

	//Constructeur chargé toutes infos
	public Adresse(long idAdresse, String rue, int codePostal, String ville) {
		this.idAdresse = idAdresse;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	} //end ctor chargé toutes infos

	//Constructeur chargé sans ID
	public Adresse(String rue, int codePostal, String ville) {
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	} //end ctor chargé sans ID

	/* toString */
	@Override
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville
				+ "]";
	} //end toString	

} //end class
