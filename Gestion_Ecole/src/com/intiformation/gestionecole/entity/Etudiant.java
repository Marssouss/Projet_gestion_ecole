package com.intiformation.gestionecole.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="etudiants")
public class Etudiant extends Personne implements Serializable {
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="id_etudiant")
//	private long idEtudiant;
	
	@Column(name="photo")
	private String photo;
	
	@Column(name="date_de_naissance")
	@Temporal(TemporalType.DATE)
	private Date dateDeNaissance;
	

//	@ManyToMany(mappedBy="listeEtudiants",cascade=CascadeType.ALL)
//	private List<Cours> listeCours;
	
	@ManyToMany(mappedBy="listeEtudiants",cascade=CascadeType.ALL)
	private List<Promotion> listePromotions;
	
//	@ManyToOne
//	@JoinColumn(name="SESSION_ID",referencedColumnName="idEtudiantCours")

//	@ManyToOne
//	@JoinColumn(name="etudiant_cours_id",referencedColumnName="id_etudiant_cours")
	@OneToMany(mappedBy="etudiant",targetEntity=EtudiantCours.class,cascade=CascadeType.ALL)
	private List<EtudiantCours> etudiantsCours;
	/**
	 * Ctor vide
	 */
	public Etudiant() {

	}


	public Etudiant(String identifiant, String motDePasse, String nom, String prenom, String email, Adresse adresse,
			String photo, Date dateDeNaissance) {
		super(identifiant, motDePasse, nom, prenom, email, adresse);
		this.photo = photo;
		this.dateDeNaissance = dateDeNaissance;
	}
	
	public Etudiant(long idPersonne, String identifiant, String motDePasse, String nom, String prenom, String email,
			Adresse adresse, String photo, Date dateDeNaissance) {
		super(idPersonne, identifiant, motDePasse, nom, prenom, email, adresse);
		this.photo = photo;
		this.dateDeNaissance = dateDeNaissance;
	}

//
//	public List<Cours> getListeCours() {
//		return listeCours;
//	}
//
//
//	public void setListeCours(List<Cours> listeCours) {
//		this.listeCours = listeCours;
//	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}


	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}


	@Override
	public String toString() {
		return "Etudiant [photo=" + photo + ", dateDeNaissance=" + dateDeNaissance + ", idPersonne=" + idPersonne
				+ ", identifiant=" + identifiant + ", motDePasse=" + motDePasse + ", nom=" + nom + ", prenom=" + prenom
				+ ", email=" + email + ", adresse=" + adresse + "]";
	}

	
	
	

	
	
		
} //end class
