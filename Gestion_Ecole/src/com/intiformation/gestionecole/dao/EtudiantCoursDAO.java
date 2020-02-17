package com.intiformation.gestionecole.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.intiformation.gestionecole.entity.Administrateur;
import com.intiformation.gestionecole.entity.EtudiantCours;

public class EtudiantCoursDAO implements IGestionDAO<EtudiantCours>{

	@Override
	public List<EtudiantCours> getAll() {
		List<EtudiantCours> listeEtudiantCours = new ArrayList<>();
		
		
		try {
			listeEtudiantCours=em.createQuery("SELECT a FROM EtudiantCours a").getResultList();
			return listeEtudiantCours;
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la liste des adresses.");
		}
		
		return null;
	}

	@Override
	public EtudiantCours getById(long id) {
		EtudiantCours etudiantCours;
		
		try {
			etudiantCours=em.find(EtudiantCours.class, id);
			return etudiantCours;
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la etudiantCours");
			e.printStackTrace();
		}
		return null;
	}
	
	public List<EtudiantCours> getByIdEtudiant(long id) {
		List<EtudiantCours> etudiantCours;
		System.out.println("DAO -> "+id);
		

		
		try {
			Query query = em.createQuery("SELECT a FROM EtudiantCours a WHERE a.etudiant.idPersonne=:pIdEtudiant");
			query.setParameter("pIdEtudiant", id);
			etudiantCours = query.getResultList();
			System.out.println("DAO -> "+etudiantCours);
			return etudiantCours;
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la etudiantCours");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean add(EtudiantCours etudiantCours) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.persist(etudiantCours);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de l'ajout de la etudiantCours");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}

	@Override
	public boolean update(EtudiantCours etudiantCours) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.merge(etudiantCours);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la mise a jour de la etudiantCours");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}
	@Override
	public boolean remove(EtudiantCours etudiantCours) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.remove(etudiantCours);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la suppression de la etudiantCours");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}

}
