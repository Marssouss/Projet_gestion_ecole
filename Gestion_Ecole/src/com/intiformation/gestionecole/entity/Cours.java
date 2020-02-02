package com.intiformation.gestionecole.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cours")
public class Cours implements Serializable {
	/* Propriétés */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cours")
	private long idCours;
	
	@Column(name="libelle")
	private String libelle;
	
	@Column(name="date")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Column(name="duree")
	@Temporal(TemporalType.TIME)
	private Date duree;
	
	@Column(name="description")
	private String description;

	/* Constructeurs */
	//Constructeur vide
	public Cours() {
		
	} //end ctor vide

	//Constructeur chargé total
	public Cours(long idCours, String libelle, Date date, Date duree, String description) {
		this.idCours = idCours;
		this.libelle = libelle;
		this.date = date;
		this.duree = duree;
		this.description = description;
	} //end ctor chargé total

	//Constructeur chargé sans ID
	public Cours(String libelle, Date date, Date duree, String description) {
		this.libelle = libelle;
		this.date = date;
		this.duree = duree;
		this.description = description;
	} //end ctor chargé sans ID

	/* toString */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cours [idCours=" + idCours + ", " + (libelle != null ? "libelle=" + libelle + ", " : "")
				+ (date != null ? "date=" + date + ", " : "") + (duree != null ? "duree=" + duree + ", " : "")
				+ (description != null ? "description=" + description : "") + "]";
	}

} //end class
