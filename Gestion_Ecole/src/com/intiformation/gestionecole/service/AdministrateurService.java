package com.intiformation.gestionecole.service;

import java.util.List;

import com.intiformation.gestionecole.dao.AdministrateurDAO;
import com.intiformation.gestionecole.entity.Administrateur;

public class AdministrateurService implements IGestionService<Administrateur>{
	
	public AdministrateurDAO administrateurDAO;
	
	public AdministrateurService() {
		administrateurDAO=new AdministrateurDAO();
		
	}

	@Override
	public List<Administrateur> recupererTous() {
		return administrateurDAO.getAll();
	}

	@Override
	public Administrateur recupererParId(long id) {
		return administrateurDAO.getById(id);
	}

	@Override
	public boolean ajouter(Administrateur administrateur) {
		return administrateurDAO.add(administrateur);
	}

	@Override
	public boolean modifier(Administrateur administrateur) {
		return administrateurDAO.update(administrateur);
	}

	@Override
	public boolean supprimer(Administrateur administrateur) {
		return administrateurDAO.remove(administrateur);
	}
	
	
	

}
