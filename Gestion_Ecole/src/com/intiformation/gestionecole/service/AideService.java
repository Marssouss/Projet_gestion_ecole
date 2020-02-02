package com.intiformation.gestionecole.service;

import java.util.List;

import com.intiformation.gestionecole.dao.AideDAO;
import com.intiformation.gestionecole.entity.Aide;

public class AideService implements IGestionService<Aide>{
	
	public AideDAO aideDAO;
	
	public AideService() {
		aideDAO=new AideDAO();
		
	}

	@Override
	public List<Aide> recupererTous() {
		return aideDAO.getAll();
	}

	@Override
	public Aide recupererParId(long id) {
		return aideDAO.getById(id);
	}

	@Override
	public boolean ajouter(Aide aide) {
		return aideDAO.add(aide);
	}

	@Override
	public boolean modifier(Aide aide) {
		return aideDAO.update(aide);
	}

	@Override
	public boolean supprimer(Aide aide) {
		return aideDAO.remove(aide);
	}
	
	
	

}
