package com.intiformation.gestionecole.service;

import java.util.List;

import com.intiformation.gestionecole.dao.AdresseDAO;
import com.intiformation.gestionecole.entity.Adresse;

public class AdresseService implements IGestionService<Adresse>{
	
	public AdresseDAO adresseDAO;
	
	public AdresseService() {
		adresseDAO=new AdresseDAO();
		
	}

	@Override
	public List<Adresse> recupererTous() {
		return adresseDAO.getAll();
	}

	@Override
	public Adresse recupererParId(long id) {
		return adresseDAO.getById(id);
	}

	@Override
	public boolean ajouter(Adresse adresse) {
		return adresseDAO.add(adresse);
	}

	@Override
	public boolean modifier(Adresse adresse) {
		return adresseDAO.update(adresse);
	}

	@Override
	public boolean supprimer(Adresse adresse) {
		return adresseDAO.remove(adresse);
	}
	
	
	

}
