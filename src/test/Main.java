package test;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main (String[] args) {
		
		String maChaine = "salut les copains !";
		
		MaClasse Objet = new MaClasse(8); 
		MaClasse Objet2 = new MaClasse(12);
		
		
		
		étudiant Antony = new étudiant ("Laigneau", "Antony", 18, "BTS SIO1");
		étudiant Anthony = new étudiant("Martin", "Anthony", 19, "BTS SIO1");
		
		
		
		Classe BTSSIO = new Classe();
		BTSSIO.addEtudiant(Antony);
		BTSSIO.addEtudiant(Anthony);

		
	
	
		
		
		
		Elephant tchoupi = new Elephant(360, 20, "tchoupi", 1000, "croquettes");
		Antony.ajouterElephant(tchoupi);
		Antony.sePresenter();
	}
}
