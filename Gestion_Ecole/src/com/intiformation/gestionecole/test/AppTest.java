package com.intiformation.gestionecole.test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.intiformation.gestionecole.entity.Adresse;
import com.intiformation.gestionecole.entity.Cours;
import com.intiformation.gestionecole.entity.Etudiant;
import com.intiformation.gestionecole.service.EtudiantService;

public class AppTest {
	
	public static void main(String[] args) {

		//TEST ADMINISTRATEUR 
//	AdministrateurService administrateurService = new AdministrateurService();
//	Adresse adresse = new Adresse("29 rue test", "33000", "Bordeaux");
//	Administrateur administrateur = new Administrateur("Identifiant", "Mdp", "nom", "prenom", "Mail", adresse);
//	
//	//Ajout 
//	
//	if(administrateurService.ajouter(administrateur)) {
//		System.out.println("L'ajout de l'admin a été correctement effectué");
//	}
//	
//	//Modif
//	
//	administrateur.setNom("Nom Admin modifier");
//	if(administrateurService.modifier(administrateur)) {
//		System.out.println("L amodification du client à été réalisée avec succés");
//	}
//	
//	//Chercher par ID
//	Administrateur administrateurChercher = administrateurService.recupererParId(1);
//	System.out.println("Search by id : ");
//	System.out.println(administrateurChercher);
//	
//	//Recuperer la liste
//	List<Administrateur> listeAdministrateur = administrateurService.recupererTous();
//	System.out.println("Liste Amdins");
//	for(Administrateur adminCourant : listeAdministrateur) {
//		System.out.println(adminCourant);
//	}
//	
//	//Supprimer
//	if(administrateurService.supprimer(administrateurChercher)) {
//		System.out.println("La suppression de l'admin a corectement réussie.");
//	}
	
	
	
	
	//Test Aide
//	AideService aideService = new AideService();
//	Aide aide = new Aide("Page 1", "Contenut");
//	
//	if(aideService.ajouter(aide)) {
//		System.out.println("Ajout de laide OK");
//	}
//	
//	aide.setPage("Page 1 mod");
//	if(aideService.modifier(aide)) {
//		System.out.println("Modif de AIDE OK");
//	}
//	
//	Aide aideSearched = aideService.recupererParId(1);
//	
//	System.out.println(aideSearched);
//	
//	List<Aide> listeAide = aideService.recupererTous();
//	for(Aide help : listeAide) {
//		System.out.println(help);
//	}
//	
//	if(aideService.supprimer(aideSearched)) {
//		System.out.println("Suppression OK");
//	}
		
		
		Date date = new Date(2020, 02, 02);
		Calendar duree = Calendar.getInstance();
		duree.add(Calendar.HOUR, 1);
		duree.add(Calendar.MINUTE, 30);
		
		Cours cours = new Cours("Libele", date, duree, "Description");
		Adresse adresse = new Adresse("29 rue test", "33000", "Bordeaux");
		Date dateDeNaissance =new Date(1995, 12, 10);
		EtudiantService etudiantService = new EtudiantService();
		Etudiant etudiant = new Etudiant("identifiant", "mdp", "nom", "prenom", "mail", adresse, "photo", dateDeNaissance);
		List<Cours> listeCours= new ArrayList<Cours>();
		listeCours.add(cours);
		etudiant.setListeCours(listeCours);
		
		
		
		if(etudiantService.ajouter(etudiant)) {
			System.out.println("Ajout de laide OK");
		}
		
		etudiant.setEmail("Mail modif");
		if(etudiantService.modifier(etudiant)) {
			System.out.println("Modif de AIDE OK");
		}
		
		Etudiant etudiantSearched = etudiantService.recupererParId(1);
		
		System.out.println(etudiant);
		
		List<Etudiant> listeEtudiants = etudiantService.recupererTous();
		for(Etudiant help : listeEtudiants) {
			System.out.println(help);
		}
		
//		if(etudiantService.supprimer(etudiantSearched)) {
//			System.out.println("Suppression OK");
//		}
//		
		
		
		
		
		
		
	}//end main
}//end class


