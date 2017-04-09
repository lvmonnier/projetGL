package fr.univ.projet.modele;

import java.util.*;

public class Roles {
	private List<Role> roles;
	
	public Roles () { this(new ArrayList<Role>()); }
	
	public Roles(List<Role> roles) {
		super();
		this.roles = roles;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	public void addRole (Role r) {
		(this.roles).add(r);
	}
	
	public String toString() {
		String so = "";
		for (Iterator<Role> it = roles.listIterator(); it.hasNext(); ){
			so += it.next().toString();
		}
		return so;
	}

}
