package com.intiformation.gestionecole.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.intiformation.gestionecole.entity.Aide;
import com.intiformation.gestionecole.service.AideService;

@ManagedBean(name="aideBean")
@SessionScoped
public class AideBean implements Serializable {
	
	private String page;
	private String contenu;
	
	private AideService aideService;
	
	public AideBean() {
		
		aideService = new AideService();
	}


	public String getPage() {
		return page;
	}


	public void setPage(String page) {
		this.page = page;
	}


	public String getContenu() {
		return contenu;
	}


	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
	
	public String naviguerVersAide() {
		return "navAide";
	}
	
	public boolean ajouterAide() {
		
		Aide aide = new Aide(page, contenu);
		return(aideService.ajouter(aide));
	}
	
	
	

}
