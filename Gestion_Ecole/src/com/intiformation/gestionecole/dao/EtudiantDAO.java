package com.intiformation.gestionecole.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.intiformation.gestionecole.entity.Enseignant;
import com.intiformation.gestionecole.entity.Etudiant;

public class EtudiantDAO implements IGestionDAO<Etudiant>{

	@Override
	public List<Etudiant> getAll() {

		List<Etudiant> listeEtudiants = new ArrayList<>();
		
		
		try {
			listeEtudiants=em.createQuery("SELECT a FROM Etudiants a").getResultList();
			return listeEtudiants;
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la liste des adresses.");
		}
		
		return null;
	
	}

	@Override
	public Etudiant getById(long id) {
		Etudiant etudiant;
		
		try {
			etudiant=em.find(Etudiant.class, id);
			return etudiant;
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la etudiant");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean add(Etudiant etudiant) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.persist(etudiant);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de l'ajout de la etudiant");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}

	@Override
	public boolean update(Etudiant etudiant) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.merge(etudiant);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la mise a jour de la etudiant");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}
	@Override
	public boolean remove(Etudiant etudiant) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.remove(etudiant);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la suppression de la etudiant");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}

}
