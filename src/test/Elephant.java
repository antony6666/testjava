package test;

public class Elephant {
	private int taille;
	private int age;
	private String nom;
	private int poids;
	private String nourriture;

public Elephant (int p_taille, int p_age, String p_nom, int p_poids, String p_nourriture)
	{
	taille = p_taille;
	age = p_age;
	nom = p_nom;
	poids = p_poids; 
	nourriture = p_nourriture;
	}

public void sePresenter()
{
	System.out.println(taille);
	System.out.println(age);
	System.out.println(nom);
	System.out.println(poids);
	System.out.println(nourriture);
}

public int  getPoids() {
	return poids;
}

public void setPoids(int poids) {
	this.poids = poids;
}


public String getnourriture() {
	return nourriture;
}

public void setnourriture(String nourriture) {
	this.nourriture = nourriture;
}

}
