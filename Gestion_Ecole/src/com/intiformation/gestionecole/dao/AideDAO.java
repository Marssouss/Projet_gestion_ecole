package com.intiformation.gestionecole.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.intiformation.gestionecole.entity.Aide;

public class AideDAO implements IGestionDAO<Aide>{
	
	

	@Override
	public List<Aide> getAll() {
		
		List<Aide> listeAides = new ArrayList<>();
		
		
		try {
			listeAides=em.createQuery("SELECT a FROM Aide a").getResultList();
			return listeAides;
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la liste des aides.");
		}
		
		return null;
	}

	@Override
	public Aide getById(long id) {
		Aide aide=null;
		
		try {
			aide=em.find(Aide.class, id);
			return aide;
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la aide");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean add(Aide aide) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.persist(aide);
			tx.commit();
			return true;
			
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de l'ajout de la aide");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		return false;
	}

	@Override
	public boolean update(Aide aide) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.merge(aide);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la mise a jour de la aide");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}
	@Override
	public boolean remove(Aide aide) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.remove(aide);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la suppression de la aide");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}

}
