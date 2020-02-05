package com.intiformation.gestionecole.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIParameter;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.intiformation.gestionecole.entity.Administrateur;
import com.intiformation.gestionecole.service.AdministrateurService;

@ManagedBean(name = "gestionAdminBean")
@SessionScoped
public class GestionAdminBean implements Serializable {

	private List<Administrateur> listeAdministrateurs;

	AdministrateurService administrateurService = new AdministrateurService();


	public GestionAdminBean() {
	}

	
	
	
	
	

	public void setListeAdministrateurs(List<Administrateur> listeAdministrateurs) {
		this.listeAdministrateurs = listeAdministrateurs;
	}
	
	public List<Administrateur> getListeAdministrateurs() {
		return listeAdministrateurs;
	}

	public void supprimerAdministrateur(ActionEvent event) {
		
		//récup du param passé au click du lien supprimer 
		UIParameter component= (UIParameter) event.getComponent().findComponent("deleteID");//Attention c'est l'id du composant qu'il faut donner. pas le nom du parametre !!!!!!
		Long adminId = (Long) component.getValue();
		Administrateur administrateur = administrateurService.recupererParId(adminId);
		FacesContext context=null;
		if(administrateurService.supprimer(administrateur)){
			context = FacesContext.getCurrentInstance();
			FacesMessage messageDelete=new FacesMessage("Le livre à été supprimé avec succés");
//			context.addMessage("", messageDelete); //Premier parametre = id du composant à cibler
			context.addMessage(null, messageDelete); //Ici le message est global pour toute la page.
		}else{
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Le livre n'a pas pu être supprimé", "Voir la console pour plus de détails."));
			
		
		}
	}
	

	public List<Administrateur> adminAfficherTous() {

		return administrateurService.recupererTous();
	}
	
	public void modifierAdministrateur(ActionEvent event) {
		
	}

}
