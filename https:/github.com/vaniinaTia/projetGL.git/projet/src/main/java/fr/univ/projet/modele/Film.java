package fr.univ.projet.modele;

public class Film {
	private String titre;
	private String genre;
	private String pays;
	private String resume;
	private Roles roles;
	
	public Film () { this("", "", "", "", new Roles()); }
	
	public Film(String titre, String genre, String pays, String resume, Roles roles) {
		super();
		this.titre = titre;
		this.genre = genre;
		this.pays = pays;
		this.resume = resume;
		this.roles = roles;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	
	public void addRoles (Roles rs) {
		this.setRoles(rs);
	}
	
	public String toString() {
		return "\"" + titre + "\" \nGenre: " + genre + "\tPays: " + pays + "\nRésumé: " + resume + "\n" + roles.toString() + "\n\n";
	}
	
	

}
