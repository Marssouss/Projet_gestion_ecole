package com.intiformation.gestionecole.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.intiformation.gestionecole.entity.Administrateur;
import com.intiformation.gestionecole.entity.Adresse;

public class AdresseDAO implements IGestionDAO<Adresse>{

	@Override
	public List<Adresse> getAll() {
		List<Adresse> listeAdresse = new ArrayList<>();
		
		
		try {
			listeAdresse=em.createQuery("SELECT a FROM Adresse a").getResultList();
			return listeAdresse;
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la liste des adresses.");
		}
		
		return null;
	}

	@Override
	public Adresse getById(long id) {
		Adresse adresse;
		
		try {
			adresse=em.find(Adresse.class, id);
			return adresse;
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la adresse");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean add(Adresse adresse) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.persist(adresse);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de l'ajout de la adresse");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}

	@Override
	public boolean update(Adresse adresse) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.merge(adresse);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la mise a jour de la adresse");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}
	@Override
	public boolean remove(Adresse adresse) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.remove(adresse);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la suppression de la adresse");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}

}
