package com.intiformation.gestionecole.service;

import java.util.List;

import com.intiformation.gestionecole.dao.MatiereDAO;
import com.intiformation.gestionecole.entity.Matiere;

public class MatiereService implements IGestionService<Matiere>{
	
	public MatiereDAO matiereDAO;
	
	public MatiereService() {
		matiereDAO=new MatiereDAO();
		
	}

	@Override
	public List<Matiere> recupererTous() {
		return matiereDAO.getAll();
	}

	@Override
	public Matiere recupererParId(long id) {
		return matiereDAO.getById(id);
	}

	@Override
	public boolean ajouter(Matiere matiere) {
		return matiereDAO.add(matiere);
	}

	@Override
	public boolean modifier(Matiere matiere) {
		return matiereDAO.update(matiere);
	}

	@Override
	public boolean supprimer(Matiere matiere) {
		return matiereDAO.remove(matiere);
	}
	
	
	

}
