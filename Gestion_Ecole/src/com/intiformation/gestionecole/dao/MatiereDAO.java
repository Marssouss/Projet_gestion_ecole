package com.intiformation.gestionecole.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.intiformation.gestionecole.entity.Etudiant;
import com.intiformation.gestionecole.entity.Matiere;

public class MatiereDAO implements IGestionDAO<Matiere>{

	@Override
	public List<Matiere> getAll() {

		List<Matiere> listeMatieres = new ArrayList<>();
		
		
		try {
			listeMatieres=em.createQuery("SELECT a FROM Matiere a").getResultList();
			return listeMatieres;
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la liste des adresses.");
		}
		
		return null;
	
	
	
	}

	@Override
	public Matiere getById(long id) {
		Matiere matiere;
		
		try {
			matiere=em.find(Matiere.class, id);
			return matiere;
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la matiere");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean add(Matiere matiere) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.persist(matiere);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de l'ajout de la matiere");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}

	@Override
	public boolean update(Matiere matiere) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.merge(matiere);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la mise a jour de la matiere");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}
	@Override
	public boolean remove(Matiere matiere) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.remove(matiere);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la suppression de la matiere");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}

}
