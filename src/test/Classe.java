package test;

import java.util.ArrayList;
import java.util.List;

public class Classe {
	private List<�tudiant>etudiants;

	
	public Classe() {
	etudiants = new ArrayList<�tudiant>();
	}
	
	�tudiant getEtudiants(int index) {
		return etudiants.get(index);
	}
	
	public void addEtudiant(�tudiant etudiant) {
		etudiants.add(etudiant);
	}
	
	public void removeEtudiant(int index) {
		etudiants.remove(index);
	}
	
	public void presenterClasse() {
		System.out.println("la classe se compse de " + etudiants.size() + " �tudiants :");
		for (int i= 0; i< etudiants.size() ; i++) {
			etudiants.get(i).sePresenter();
		}
	}
	
	

	
}
