package com.intiformation.gestionecole.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="enseigner")
public class Enseigner implements Serializable {
	/* Propriétés */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_enseigner")
	private long idEnseigner;
	
	@Column(name="enseignant_id")
	private long enseignantId;
	
	@Column(name="matiere_id")
	private long matiereId;
	
	@Column(name="promotion_id")
	private long promotionId;

	/* Constructeurs */
	//Constructeur vide
	public Enseigner() {
		
	} //end ctor vide

	//Constructeur chargé total
	public Enseigner(long idEnseigner, long enseignantId, long matiereId, long promotionId) {
		this.idEnseigner = idEnseigner;
		this.enseignantId = enseignantId;
		this.matiereId = matiereId;
		this.promotionId = promotionId;
	} //end ctor chargé total

	//Constructeur chargé sans ID
	public Enseigner(long enseignantId, long matiereId, long promotionId) {
		this.enseignantId = enseignantId;
		this.matiereId = matiereId;
		this.promotionId = promotionId;
	} //end ctor chargé sans ID

	/* Getters & Setters */
	/**
	 * @return the idEnseigner
	 */
	public long getIdEnseigner() {
		return idEnseigner;
	}

	/**
	 * @param idEnseigner the idEnseigner to set
	 */
	public void setIdEnseigner(long idEnseigner) {
		this.idEnseigner = idEnseigner;
	}

	/**
	 * @return the enseignantId
	 */
	public long getEnseignantId() {
		return enseignantId;
	}

	/**
	 * @param enseignantId the enseignantId to set
	 */
	public void setEnseignantId(long enseignantId) {
		this.enseignantId = enseignantId;
	}

	/**
	 * @return the matiereId
	 */
	public long getMatiereId() {
		return matiereId;
	}

	/**
	 * @param matiereId the matiereId to set
	 */
	public void setMatiereId(long matiereId) {
		this.matiereId = matiereId;
	}

	/**
	 * @return the promotionId
	 */
	public long getPromotionId() {
		return promotionId;
	}

	/**
	 * @param promotionId the promotionId to set
	 */
	public void setPromotionId(long promotionId) {
		this.promotionId = promotionId;
	}

	/* toString */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Enseigner [idEnseigner=" + idEnseigner + ", enseignantId=" + enseignantId + ", matiereId=" + matiereId
				+ ", promotionId=" + promotionId + "]";
	} //end toString	

}
