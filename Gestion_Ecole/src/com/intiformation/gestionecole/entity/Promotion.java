package com.intiformation.gestionecole.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="promotions")
public class Promotion implements Serializable {
	/* Propriétés */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_promotion")
	public long idPromotion;
	
	@Column(name="libelle")
	public String libelle;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Promotion_Assos_Etudiants",
			   joinColumns=@JoinColumn(name="Promotion_ID"),
			   inverseJoinColumns=@JoinColumn(name="Etudiant_ID")
			  )
	List<Etudiant> listeEtudiants;
	
	@JoinTable(name="Promotion_Assos_Cours",
			   joinColumns=@JoinColumn(name="Promotion_ID"),
			   inverseJoinColumns=@JoinColumn(name="Cours_ID")
			  )
	List<Cours> listeCours;
	

	/* Constructeurs */
	//Constructeur vide
	public Promotion() {
		
	} //end ctor vide

	//Constructeur chargé total
	public Promotion(long idPromotion, String libelle) {
		this.idPromotion = idPromotion;
		this.libelle = libelle;
	} //end ctor chargé total

	//Constructeur chargé sans ID
	public Promotion(String libelle) {
		this.libelle = libelle;
	} //end ctor chargé sans ID

	/* toString */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Promotion [idPromotion=" + idPromotion + ", " + (libelle != null ? "libelle=" + libelle : "") + "]";
	} //end toString

	public long getIdPromotion() {
		return idPromotion;
	}

	public void setIdPromotion(long idPromotion) {
		this.idPromotion = idPromotion;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Etudiant> getListeEtudiants() {
		return listeEtudiants;
	}

	public void setListeEtudiants(List<Etudiant> listeEtudiants) {
		this.listeEtudiants = listeEtudiants;
	}

	
	
} //end class
