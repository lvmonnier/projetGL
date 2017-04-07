package fr.univ.projet.modele;

public class Role {
	private String nom;
	private String prenom;
	private String intitule;
	
	public Role(String nom, String prenom, String intitule) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.intitule = intitule;
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
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

}
