package com.intiformation.gestionecole.service;

import java.util.List;

import com.intiformation.gestionecole.dao.EnseignantDAO;
import com.intiformation.gestionecole.entity.Enseignant;

public class EnseignantService implements IGestionService<Enseignant>{
	
	public EnseignantDAO enseignantDAO;
	
	public EnseignantService() {
		enseignantDAO=new EnseignantDAO();
		
	}

	@Override
	public List<Enseignant> recupererTous() {
		return enseignantDAO.getAll();
	}

	@Override
	public Enseignant recupererParId(long id) {
		return enseignantDAO.getById(id);
	}

	@Override
	public boolean ajouter(Enseignant enseignant) {
		return enseignantDAO.add(enseignant);
	}

	@Override
	public boolean modifier(Enseignant enseignant) {
		return enseignantDAO.update(enseignant);
	}

	@Override
	public boolean supprimer(Enseignant enseignant) {
		return enseignantDAO.remove(enseignant);
	}
	
	
	

}
