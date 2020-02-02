package com.intiformation.gestionecole.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.intiformation.gestionecole.entity.Cours;
import com.intiformation.gestionecole.entity.Enseignant;

public class EnseignantDAO implements IGestionDAO<Enseignant>{

	@Override
	public List<Enseignant> getAll() {

		List<Enseignant> listeEnseignant = new ArrayList<>();
		
		
		try {
			listeEnseignant=em.createQuery("SELECT a FROM Enseignant a").getResultList();
			return listeEnseignant;
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la liste des adresses.");
		}
		
		return null;
	}

	@Override
	public Enseignant getById(long id) {
		Enseignant enseignant;
		
		try {
			enseignant=em.find(Enseignant.class, id);
			return enseignant;
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la enseignant");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean add(Enseignant enseignant) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.persist(enseignant);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de l'ajout de la enseignant");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}

	@Override
	public boolean update(Enseignant enseignant) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.merge(enseignant);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la mise a jour de la enseignant");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}
	@Override
	public boolean remove(Enseignant enseignant) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.remove(enseignant);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la suppression de la enseignant");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}

}
