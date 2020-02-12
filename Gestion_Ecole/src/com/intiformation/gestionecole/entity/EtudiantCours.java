package com.intiformation.gestionecole.entity;

import java.io.Serializable;

import javax.faces.bean.SessionScoped;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="etudiants_cours")
@SessionScoped
public class EtudiantCours implements Serializable {
	/* Propriétés */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_etudiant_cours")
	private long idEtudiantCours;
	
	@Column(name="absence")
	private boolean absence;
	
	@Column(name="motif")
	private String motif;
	
	@OneToOne(cascade=CascadeType.ALL)//Ajout en cascade, suppr en cascade....
	@JoinColumn(name="cours_id",referencedColumnName="id_cours")//Gestion de la FK	
	private Cours cours;

//	@OneToMany(mappedBy="etudiantsCours",
//			   targetEntity=Etudiant.class,
//			   cascade=CascadeType.ALL)
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Etudiant_ID",referencedColumnName="id_personne")
	private Etudiant etudiant;

	/* Constructeurs */
	//Constructeur vide
	public EtudiantCours() {
		
	} //end ctor vide

	//Constructeur chargé total
	
	public EtudiantCours(long idEtudiantCours, boolean absence, String motif, Cours cours, Etudiant etudiant) {
		this.idEtudiantCours = idEtudiantCours;
		this.absence = absence;
		this.motif = motif;
		this.cours = cours;
		this.etudiant = etudiant;
	} //end ctor chargé total

	//Constructeur chargé sans ID
	public EtudiantCours(boolean absence, String motif, Cours cours, Etudiant etudiant) {
		this.absence = absence;
		this.motif = motif;
		this.cours = cours;
		this.etudiant = etudiant;
	} //end ctor chargé sans ID
	
	/* Getters & Setters */
	/**
	 * @return the idEtudiantCours
	 */
	public long getIdEtudiantCours() {
		return idEtudiantCours;
	}

	/**
	 * @param idEtudiantCours the idEtudiantCours to set
	 */
	public void setIdEtudiantCours(long idEtudiantCours) {
		this.idEtudiantCours = idEtudiantCours;
	}

	/**
	 * @return the absence
	 */
	public boolean isAbsence() {
		return absence;
	}

	/**
	 * @param absence the absence to set
	 */
	public void setAbsence(boolean absence) {
		this.absence = absence;
	}

	/**
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}

	/**
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	/**
	 * @return the coursId
	 */
	public Cours getCoursId() {
		return cours;
	}

	/**
	 * @param coursId the coursId to set
	 */
	public void setCoursId(Cours cours) {
		this.cours = cours;
	}

	/**
	 * @return the etudiantId
	 */
	public Etudiant getEtudiantId() {
		return etudiant;
	}

	/**
	 * @param etudiantId the etudiantId to set
	 */
	public void setEtudiantId(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	/* toString */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EtudiantCours [idEtudiantCours=" + idEtudiantCours + ", absence=" + absence + ", "
				+ (motif != null ? "motif=" + motif + ", " : "") + "coursId=" + cours + ", etudiantId=" + etudiant
				+ "]";
	} //end toString

} //end class
