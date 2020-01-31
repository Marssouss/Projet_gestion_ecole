package com.intiformation.gestionecole.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="etudiant_cours")
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
	
	@Column(name="cours_id")
	private long coursId;
	
	@Column(name="etudiant_id")
	private long etudiantId;

	/* Constructeurs */
	//Constructeur vide
	public EtudiantCours() {
		
	} //end ctor vide

	//Constructeur chargé total
	public EtudiantCours(long idEtudiantCours, boolean absence, String motif, long coursId, long etudiantId) {
		this.idEtudiantCours = idEtudiantCours;
		this.absence = absence;
		this.motif = motif;
		this.coursId = coursId;
		this.etudiantId = etudiantId;
	} //end ctor chargé total

	//Constructeur chargé sans ID
	public EtudiantCours(boolean absence, String motif, long coursId, long etudiantId) {
		this.absence = absence;
		this.motif = motif;
		this.coursId = coursId;
		this.etudiantId = etudiantId;
	} //end ctor chargé sans ID

	/* toString */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EtudiantCours [idEtudiantCours=" + idEtudiantCours + ", absence=" + absence + ", "
				+ (motif != null ? "motif=" + motif + ", " : "") + "coursId=" + coursId + ", etudiantId=" + etudiantId
				+ "]";
	} //end toString

} //end class
