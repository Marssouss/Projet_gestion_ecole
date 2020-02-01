package com.intiformation.gestionecole.service;

import java.util.List;

import com.intiformation.gestionecole.dao.CoursDAO;
import com.intiformation.gestionecole.entity.Cours;

public class CoursService implements IGestionService<Cours>{
	
	public CoursDAO coursDAO;
	
	public CoursService() {
		coursDAO=new CoursDAO();
		
	}

	@Override
	public List<Cours> recupererTous() {
		return coursDAO.getAll();
	}

	@Override
	public Cours recupererParId(long id) {
		return coursDAO.getById(id);
	}

	@Override
	public boolean ajouter(Cours cours) {
		return coursDAO.add(cours);
	}

	@Override
	public boolean modifier(Cours cours) {
		return coursDAO.update(cours);
	}

	@Override
	public boolean supprimer(Cours cours) {
		return coursDAO.remove(cours);
	}
	
	
	

}
