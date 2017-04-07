package fr.univ.projet.modele;

import java.util.*;

public class Roles {
	private ArrayList roles = new ArrayList<Role>();
	
	public Roles(ArrayList roles) {
		super();
		this.roles = roles;
	}

	public ArrayList getRoles() {
		return roles;
	}

	public void setRoles(ArrayList roles) {
		this.roles = roles;
	}

}
