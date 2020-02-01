package com.intiformation.gestionecole.service;

import java.util.List;

import com.intiformation.gestionecole.dao.PromotionDAO;
import com.intiformation.gestionecole.entity.Promotion;

public class PromotionService implements IGestionService<Promotion>{
	
	public PromotionDAO promotionDAO;
	
	public PromotionService() {
		promotionDAO=new PromotionDAO();
		
	}

	@Override
	public List<Promotion> recupererTous() {
		return promotionDAO.getAll();
	}

	@Override
	public Promotion recupererParId(long id) {
		return promotionDAO.getById(id);
	}

	@Override
	public boolean ajouter(Promotion promotion) {
		return promotionDAO.add(promotion);
	}

	@Override
	public boolean modifier(Promotion promotion) {
		return promotionDAO.update(promotion);
	}

	@Override
	public boolean supprimer(Promotion promotion) {
		return promotionDAO.remove(promotion);
	}
	
	
	

}
