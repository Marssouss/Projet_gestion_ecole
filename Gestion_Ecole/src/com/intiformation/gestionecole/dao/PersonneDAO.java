package com.intiformation.gestionecole.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.intiformation.gestionecole.entity.Matiere;
import com.intiformation.gestionecole.entity.Personne;

public class PersonneDAO implements IGestionDAO<Personne>{

	@Override
	public List<Personne> getAll() {

		List<Personne> listePersonnes = new ArrayList<>();
		
		
		try {
			listePersonnes=em.createQuery("SELECT a FROM Personnes a").getResultList();
			return listePersonnes;
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la liste des adresses.");
		}
		
		return null;
	
	
	
	}

	@Override
	public Personne getById(long id) {
		Personne personne;
		
		try {
			personne=em.find(Personne.class, id);
			return personne;
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la personne");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean add(Personne personne) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.persist(personne);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de l'ajout de la personne");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}

	@Override
	public boolean update(Personne personne) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.merge(personne);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la mise a jour de la personne");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}
	@Override
	public boolean remove(Personne personne) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.remove(personne);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la suppression de la personne");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}

}
