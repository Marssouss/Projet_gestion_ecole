package com.intiformation.gestionecole.dao;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.intiformation.gestionecole.entity.Promotion;

public class PromotionDAO implements IGestionDAO<Promotion>{

	@Override
	public List<Promotion> getAll() {
		return null;
	}

	@Override
	public Promotion getById(long id) {
		Promotion promotion;
		
		try {
			promotion=em.find(Promotion.class, id);
			return promotion;
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la récupération de la promotion");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean add(Promotion promotion) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.persist(promotion);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de l'ajout de la promotion");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}

	@Override
	public boolean update(Promotion promotion) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.merge(promotion);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la mise a jour de la promotion");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}
	@Override
	public boolean remove(Promotion promotion) {

		EntityTransaction tx=null;
		
		try {
			
			tx=em.getTransaction();
			tx.begin();
			em.remove(promotion);
			tx.commit();
			return true;
			
			
		} catch (PersistenceException e) {
			System.out.println("Erreur lors de la suppression de la promotion");
			if (tx != null) {
				// 6 Annulation de la transaction
				tx.rollback();
				e.printStackTrace();
			}
		}
		
		
		return false;
	}

}
