package test;

import java.util.ArrayList;
import java.util.List;

public class Classe {
	private List<étudiant>etudiants;

	
	public Classe() {
	etudiants = new ArrayList<étudiant>();
	}
	
	étudiant getEtudiants(int index) {
		return etudiants.get(index);
	}
	
	public void addEtudiant(étudiant etudiant) {
		etudiants.add(etudiant);
	}
	
	public void removeEtudiant(int index) {
		etudiants.remove(index);
	}
	
	public void presenterClasse() {
		System.out.println("la classe se compse de " + etudiants.size() + " étudiants :");
		for (int i= 0; i< etudiants.size() ; i++) {
			etudiants.get(i).sePresenter();
		}
	}
	
	

	
}
