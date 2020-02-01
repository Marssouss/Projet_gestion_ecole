package com.intiformation.gestionecole.service;

import java.util.List;

import com.intiformation.gestionecole.dao.EtudiantDAO;
import com.intiformation.gestionecole.entity.Etudiant;

public class EtudiantService implements IGestionService<Etudiant>{
	
	public EtudiantDAO etudiantDAO;
	
	public EtudiantService() {
		etudiantDAO=new EtudiantDAO();
		
	}

	@Override
	public List<Etudiant> recupererTous() {
		return etudiantDAO.getAll();
	}

	@Override
	public Etudiant recupererParId(long id) {
		return etudiantDAO.getById(id);
	}

	@Override
	public boolean ajouter(Etudiant etudiant) {
		return etudiantDAO.add(etudiant);
	}

	@Override
	public boolean modifier(Etudiant etudiant) {
		return etudiantDAO.update(etudiant);
	}

	@Override
	public boolean supprimer(Etudiant etudiant) {
		return etudiantDAO.remove(etudiant);
	}
	
	
	

}
