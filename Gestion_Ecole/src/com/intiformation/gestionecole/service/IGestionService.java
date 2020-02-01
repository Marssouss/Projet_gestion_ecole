package com.intiformation.gestionecole.service;

import java.util.List;

public interface IGestionService<T> {
	
	
	
	public List<T> recupererTous();
	
	public T recupererParId(long id);
	
	public boolean ajouter(T object);
	
	public boolean modifier(T object);
	
	public boolean supprimer(T object);
	

}
