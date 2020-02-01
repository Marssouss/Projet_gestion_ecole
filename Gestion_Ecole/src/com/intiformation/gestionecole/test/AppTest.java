package com.intiformation.gestionecole.test;

import java.util.List;

import com.intiformation.gestionecole.entity.Administrateur;
import com.intiformation.gestionecole.service.AdministrateurService;

public class AppTest {
	
	public static void main(String[] args) {

		//TEST ADMINISTRATEUR 
	AdministrateurService administrateurService = new AdministrateurService();
	Administrateur administrateur = new Administrateur("Identifiant Admin", "Mdp Admin", "Nom Admin", "Prenom Admin", "MailAdmin");
	
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
	if(administrateurService.supprimer(administrateurChercher)) {
		System.out.println("La suppression de l'admin a corectement réussie.");
	}
	
	
		
	
	}
	
}


