package com.intiformation.gestionecole.entity;

import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adresses")
@SessionScoped
public class Adresse {
	/* Propri�t�s */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_adresse")
	private long idAdresse;
	
	@Column(name="rue")
	private String rue;
	
	@Column(name="code_postal")
	private String codePostal;
	
	@Column(name="ville")
	private String ville;
	
//	@OneToOne(mappedBy="adresse",cascade=CascadeType.ALL)
//	private Personne personne;

	/* Constructeurs */
	//Constructeur vide
	public Adresse() {
		
	} //end ctor vide

	//Constructeur charg� toutes infos
	public Adresse(long idAdresse, String rue, String codePostal, String ville) {
		this.idAdresse = idAdresse;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	} //end ctor charg� toutes infos

	//Constructeur charg� sans ID
	public Adresse(String rue, String codePostal, String ville) {
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	} //end ctor charg� sans ID
	
	

	public long getIdAdresse() {
		return idAdresse;
	}

	public void setIdAdresse(long idAdresse) {
		this.idAdresse = idAdresse;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	/* toString */
	@Override
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville
				+ "]";
	} //end toString	

} //end class
