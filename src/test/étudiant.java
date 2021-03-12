package test;

import java.util.ArrayList;
import java.util.List;

public class étudiant {
	private String nom;
	private String prenom;
	private int age; 
	private String classe; 
	private List<Chien>chiens;
	private List<Elephant>elephant;
	
	
	
	
	
	
	
	
	
	
	public étudiant(String p_nom, String p_prenom, int p_age, String p_classe)
	{
		nom = p_nom;
		prenom = p_prenom;
		age = p_age;
		classe = p_classe; 

		this.elephant = new ArrayList<>();
	}

	public void sePresenter()
	{
		System.out.println(nom +' '+ prenom +' '+ age + ' '+ classe);
	
	
		
		for (int i= 0; i< elephant.size() ; i++) {
			elephant.get(i).sePresenter();
		}
		
	}
	
	public void ajouterChien(Chien p_chien) {
		chiens.add(p_chien);
	}
	public void retirerChien(int index) {
		chiens.remove(index);
	}

	
	
	public void ajouterElephant(Elephant p_elephant) {
		elephant.add(p_elephant);
	}
	public void retirerElephant(int index) {
		elephant.remove(index);
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	
	
	
	

}
