package com.intiformation.gestionecole.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.intiformation.gestionecole.entity.Administrateur;

public class AdministrateurDAO implements IGestionDAO<Administrateur>{
	
	

	@Override
	public List<Administrateur> getAll() {
		
		List<Administrateur> listeAdministrateurs = new ArrayList<>();
		
		
		try {
			listeAdministrateurs=em.createQuery("SELECT a FROM Administrateur a").getResultList();
			return listeAdministrateurs;
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la liste des administrateurs.");
		}
		
		return null;
	}

	@Override
	public Administrateur getById(long id) {
		Administrateur administrateur=null;
		
		try {
			administrateur=em.find(Administrateur.class, id);
			return administrateur;
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la administrateur");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean add(Administrateur administrateur) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.persist(administrateur);
			tx.commit();
			return true;
			
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de l'ajout de la administrateur");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		return false;
	}

	@Override
	public boolean update(Administrateur administrateur) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.merge(administrateur);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la mise a jour de la administrateur");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}
	@Override
	public boolean remove(Administrateur administrateur) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.remove(administrateur);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la suppression de la administrateur");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}

}
