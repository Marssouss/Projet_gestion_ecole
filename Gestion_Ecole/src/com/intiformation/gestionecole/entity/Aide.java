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
	/* Propri�t�s */
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

	//Constructeur charg� toutes infos
	public Aide(Long idAide, int page, String contenu) {
		this.idAide = idAide;
		this.page = page;
		this.contenu = contenu;
	} //end ctor charg� toutes infos

	//Constructeur charg� sans ID
	public Aide(int page, String contenu) {
		this.page = page;
		this.contenu = contenu;
	} //end ctor charg� sans ID

	/* toString */
	@Override
	public String toString() {
		return "Aide [idAide=" + idAide + ", page=" + page + ", contenu=" + contenu + "]";
	} //end toString
	
} //end class
