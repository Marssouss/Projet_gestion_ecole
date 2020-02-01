package com.intiformation.gestionecole.tools;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class JpaUtils {
	
	private static EntityManager em;
	
	public static EntityManager getEntityManager() {
		
		if(em==null) {
			try {
				em=Persistence.createEntityManagerFactory("Gestion_Ecole").createEntityManager();
				
			} catch (PersistenceException e) {
				System.out.println("Erreur lors de la récuperation de l'em.");
				e.printStackTrace();
			}
		}
		return em;
	}

}
