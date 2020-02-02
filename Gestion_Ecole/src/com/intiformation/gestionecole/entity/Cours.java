
package com.intiformation.gestionecole.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cours")
public class Cours implements Serializable {
	/* Propri�t�s */
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
	private Calendar duree;
	
	@Column(name="description")
	private String description;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="etudiants_cours",
			   joinColumns=@JoinColumn(name="cours_id"),
			   inverseJoinColumns=@JoinColumn(name="etudiant_id")
			  )
	List<Etudiant> listeEtudiants;

	/* Constructeurs */
	//Constructeur vide
	public Cours() {
		
	} //end ctor vide

	//Constructeur charg� total
	public Cours(long idCours, String libelle, Date date, Calendar duree, String description) {
		this.idCours = idCours;
		this.libelle = libelle;
		this.date = date;
		this.duree = duree;
		this.description = description;
	} //end ctor charg� total

	//Constructeur charg� sans ID
	public Cours(String libelle, Date date, Calendar duree, String description) {
		this.libelle = libelle;
		this.date = date;
		this.duree = duree;
		this.description = description;
	} //end ctor charg� sans ID

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

	public long getIdCours() {
		return idCours;
	}

	public void setIdCours(long idCours) {
		this.idCours = idCours;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Calendar getDuree() {
		return duree;
	}

	public void setDuree(Calendar duree) {
		this.duree = duree;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Etudiant> getListeEtudiants() {
		return listeEtudiants;
	}

	public void setListeEtudiants(List<Etudiant> listeEtudiants) {
		this.listeEtudiants = listeEtudiants;
	}

} //end class
