package com.intiformation.gestionecole.test;

import java.util.List;

import com.intiformation.gestionecole.entity.Administrateur;
import com.intiformation.gestionecole.entity.Adresse;
import com.intiformation.gestionecole.service.AdministrateurService;

public class AppTest {
	
	public static void main(String[] args) {

		//TEST ADMINISTRATEUR 
	AdministrateurService administrateurService = new AdministrateurService();
	Adresse adresse = new Adresse("29 rue test", "33000", "Bordeaux");
	Administrateur administrateur = new Administrateur("Identifiant", "Mdp", "nom", "prenom", "Mail", adresse);
	
	//Ajout 
	
	if(administrateurService.ajouter(administrateur)) {
		System.out.println("L'ajout de l'admin a été correctement effectué");
	}
	
	//Modif
	
	administrateur.setNom("Nom Admin modifier");
	if(administrateurService.modifier(administrateur)) {
		System.out.println("L amodification du client à été réalisée avec succés");
	}
	
	//Chercher par ID
	Administrateur administrateurChercher = administrateurService.recupererParId(1);
	System.out.println("Search by id : ");
	System.out.println(administrateurChercher);
	
	//Recuperer la liste
	List<Administrateur> listeAdministrateur = administrateurService.recupererTous();
	System.out.println("Liste Amdins");
	for(Administrateur adminCourant : listeAdministrateur) {
		System.out.println(adminCourant);
	}
	
	//Supprimer
//	if(administrateurService.supprimer(administrateurChercher)) {
//		System.out.println("La suppression de l'admin a corectement réussie.");
//	}
	
	
		
	
	}
	
}


