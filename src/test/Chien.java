package test;

public class Chien {
	private int taille;
	private int age;
	private String nom;
	private String race;

public Chien(int p_taille, int p_age, String p_nom, String p_race)
	{
	taille = p_taille;
	age = p_age;
	nom = p_nom;
	race = p_race; 
	}

public void sePresenter()
{
	System.out.println(taille);
	System.out.println(age);
	System.out.println(nom);
	System.out.println(race);
}

public int getTaille() {
	return taille;
}

public void setTaille(int taille) {
	this.taille = taille;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getRace() {
	return race;
}

public void setRace(String race) {
	this.race = race;
}

public String toString() {
	return nom + " trop cool ! "+ race ;

}

}



