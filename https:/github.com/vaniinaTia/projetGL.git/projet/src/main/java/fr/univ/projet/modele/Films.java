package fr.univ.projet.modele;

import java.util.*;

public class Films {
	private List<Film> films;
	
	public Films() { this(new ArrayList<Film>()); }

	public Films(List<Film> films) {
		super();
		this.films = films;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}
	
	public void addFilm (Film f) { 
		(this.films).add(f);
	}
	
	public String toString() {
		String so = "";
		for (Iterator<Film> it = films.listIterator(); it.hasNext(); ){
			so += it.next().toString();
		}
		return so;
	}
	
	

}
