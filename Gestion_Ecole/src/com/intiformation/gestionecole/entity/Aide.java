package com.intiformation.gestionecole.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aides")
public class Aide implements Serializable {
	/* Propriétés */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_aide")
	private long idAide;
	
	@Column(name="page")
	private int page;
	
	@Column(name="contenu")
	private String contenu;

	/* Constructeurs */
	//Constructeur vide
	public Aide() {
		
	} //end ctor vide

	//Constructeur chargé toutes infos
	public Aide(Long idAide, int page, String contenu) {
		this.idAide = idAide;
		this.page = page;
		this.contenu = contenu;
	} //end ctor chargé toutes infos

	//Constructeur chargé sans ID
	public Aide(int page, String contenu) {
		this.page = page;
		this.contenu = contenu;
	} //end ctor chargé sans ID

	/* toString */
	@Override
	public String toString() {
		return "Aide [idAide=" + idAide + ", page=" + page + ", contenu=" + contenu + "]";
	} //end toString
	
} //end class
