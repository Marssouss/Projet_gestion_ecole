package com.intiformation.gestionecole.service;

import java.util.List;

import com.intiformation.gestionecole.dao.PersonneDAO;
import com.intiformation.gestionecole.entity.Personne;

public class PersonneService implements IGestionService<Personne>{
	
	public PersonneDAO personneDAO;
	
	public PersonneService() {
		personneDAO=new PersonneDAO();
		
	}

	@Override
	public List<Personne> recupererTous() {
		return personneDAO.getAll();
	}

	@Override
	public Personne recupererParId(long id) {
		return personneDAO.getById(id);
	}

	@Override
	public boolean ajouter(Personne personne) {
		return personneDAO.add(personne);
	}

	@Override
	public boolean modifier(Personne personne) {
		return personneDAO.update(personne);
	}

	@Override
	public boolean supprimer(Personne personne) {
		return personneDAO.remove(personne);
	}
	
	
	

}
