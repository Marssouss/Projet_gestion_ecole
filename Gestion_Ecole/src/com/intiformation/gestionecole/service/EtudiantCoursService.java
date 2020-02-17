package com.intiformation.gestionecole.service;

import java.util.List;

import com.intiformation.gestionecole.dao.EtudiantCoursDAO;
import com.intiformation.gestionecole.entity.EtudiantCours;

public class EtudiantCoursService implements IGestionService<EtudiantCours>{
	
	public EtudiantCoursDAO etudiantCoursDAO;
	
	public EtudiantCoursService() {
		etudiantCoursDAO=new EtudiantCoursDAO();
		
	}

	@Override
	public List<EtudiantCours> recupererTous() {
		return etudiantCoursDAO.getAll();
	}

	@Override
	public EtudiantCours recupererParId(long id) {
		return etudiantCoursDAO.getById(id);
	}
	
	public List<EtudiantCours> recupererParIdEtudiant(long id) {
		return etudiantCoursDAO.getByIdEtudiant(id);
	}

	@Override
	public boolean ajouter(EtudiantCours etudiantCours) {
		return etudiantCoursDAO.add(etudiantCours);
	}

	@Override
	public boolean modifier(EtudiantCours etudiantCours) {
		return etudiantCoursDAO.update(etudiantCours);
	}

	@Override
	public boolean supprimer(EtudiantCours etudiantCours) {
		return etudiantCoursDAO.remove(etudiantCours);
	}
	
	
	

}
