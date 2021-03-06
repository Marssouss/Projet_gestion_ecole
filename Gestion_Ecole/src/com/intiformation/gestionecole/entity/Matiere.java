package com.intiformation.gestionecole.entity;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.SessionScoped;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="matieres")
@SessionScoped
public class Matiere implements Serializable{
	/* Propri�t�s */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_matiere")
	private long idMatiere;
	
	@Column(name="libelle")
	private String libelle;
	
	
	@OneToMany(mappedBy="matiere", cascade=CascadeType.ALL)
	private List<Cours> listeCours;
	
	

	
	
	
	/* Constructeurs */
	//Constructeur vide 
	public Matiere() {
		
	} //end ctor vide

	//Constructeur charg� total
	public Matiere(long idMatiere, String libelle) {
		this.idMatiere = idMatiere;
		this.libelle = libelle;
	} //end ctor charg� total

	//Constructeur charg� sans ID
	public Matiere(String libelle) {
		this.libelle = libelle;
	} //end ctor charg� sans ID

	
	
	
	
	
	
	
	public long getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(long idMatiere) {
		this.idMatiere = idMatiere;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Cours> getListeCours() {
		return listeCours;
	}

	public void setListeCours(List<Cours> listeCours) {
		this.listeCours = listeCours;
	}

	/* toString */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Matiere [idMatiere=" + idMatiere + ", " + (libelle != null ? "libelle=" + libelle : "") + "]";
	} //end toString

} //end class
