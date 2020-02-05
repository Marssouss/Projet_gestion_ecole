package com.intiformation.gestionecole.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.intiformation.gestionecole.entity.Administrateur;
import com.intiformation.gestionecole.entity.Adresse;
import com.intiformation.gestionecole.entity.Enseignant;
import com.intiformation.gestionecole.entity.Etudiant;
import com.intiformation.gestionecole.service.AdministrateurService;
import com.intiformation.gestionecole.service.EnseignantService;
import com.intiformation.gestionecole.service.EtudiantService;

@ManagedBean(name = "ajoutPersonne")
@SessionScoped
public class AjoutPersonneBean implements Serializable {

	private String type;

	private String nom;
	private String prenom;
	private String mail;
	private String mdp;
	private String rue;
	private String ville;
	private String codePostal;
	private String photo;
	private Date dateDeNaissance;
	private Adresse adresse;

	public AjoutPersonneBean() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

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
	private Map<String, String> getAtributes(){
		
		FacesContext fc= FacesContext.getCurrentInstance();
		return fc.getExternalContext().getRequestParameterMap();
	}

	public boolean ajouterPersonne() {
		
		

		adresse=new Adresse(rue, codePostal, ville); 
		
		Map<String,String> params = getAtributes();
		type = (String) params.get("type");
		
		
		if(type.equals("Administrateur")) {
			AdministrateurService administrateurService = new AdministrateurService();
			Administrateur administrateur = new Administrateur(mail, mdp, nom, prenom, mail, adresse);
			return administrateurService.ajouter(administrateur);
		}else if(type.equals("Enseignant")) {
			EnseignantService enseignantService = new EnseignantService();
			Enseignant enseignant = new Enseignant(mail, mdp, nom, prenom, mail, adresse);
			return enseignantService.ajouter(enseignant);
		}else if(type.equals("Etudiant")) {
			EtudiantService etudiantService = new EtudiantService();
			Etudiant etudiant = new Etudiant(mail, mdp, nom, prenom, mail, adresse, photo, dateDeNaissance);
			return etudiantService.ajouter(etudiant);
		}
		
		return false;
		
		
	}

}
