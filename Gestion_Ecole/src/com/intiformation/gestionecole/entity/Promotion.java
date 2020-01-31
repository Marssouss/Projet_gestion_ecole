package com.intiformation.gestionecole.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="promotions")
public class Promotion implements Serializable {
	/* Propri�t�s */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_promotion")
	public long idPromotion;
	
	@Column(name="libelle")
	public String libelle;

	/* Constructeurs */
	//Constructeur vide
	public Promotion() {
		
	} //end ctor vide

	//Constructeur charg� total
	public Promotion(long idPromotion, String libelle) {
		this.idPromotion = idPromotion;
		this.libelle = libelle;
	} //end ctor charg� total

	//Constructeur charg� sans ID
	public Promotion(String libelle) {
		this.libelle = libelle;
	} //end ctor charg� sans ID

	/* toString */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Promotion [idPromotion=" + idPromotion + ", " + (libelle != null ? "libelle=" + libelle : "") + "]";
	} //end toString

} //end class
