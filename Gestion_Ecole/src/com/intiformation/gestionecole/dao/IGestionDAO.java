package com.intiformation.gestionecole.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.intiformation.gestionecole.tools.JpaUtils;

public interface IGestionDAO<T> {
	
	public EntityManager em = JpaUtils.getEntityManager();
	
	
	public List<T> getAll();
	
	public T getById(long id);
	
	public boolean add(T object);
	
	public boolean update(T object);
	
	public boolean remove(T object);
	

}
