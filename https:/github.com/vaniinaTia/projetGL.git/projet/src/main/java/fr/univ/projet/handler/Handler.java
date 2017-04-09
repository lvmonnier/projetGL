package fr.univ.projet.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import fr.univ.projet.modele.*;

public class Handler extends DefaultHandler {
	
	private String node = null;
	private Films films;
	private Film film;
	private Roles roles;
	private Role role;
	
	//Redéfinition de la méthode pour intercepter les événements
	public void startElement(String namespaceURI, String lname, String qname, Attributes attrs) throws SAXException {
		node = qname;
		
		//dès que nous rencontrons un élément, nous créons l'objet associé
		if(qname.equals("films")) films = new Films();
		else if(qname.equals("film")) film = new Film();
		else if(qname.equals("roles")) roles = new Roles();
		else if(qname.equals("role")) role = new Role();
		//else throws BadTypeException? => implémenter
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException{
	      //Lorsque nous détectons la fin d'un élément
	      //nous l'ajoutons à son objet parent
	      if(qName.equals("film")) films.addFilm(film);
	      else if (qName.equals("role")) roles.addRole(role);
	      else if (qName.equals("roles")) film.addRoles(roles);	      
	}
	
	//permet de récupérer la valeur d'un nœud
	public void characters(char[] data, int start, int end){
		String str = new String(data, start, end);
		
		//Dès que nous les rencontrons, nous stockons la valeur dans l'objet ad hoc
		if(node.equals("titre")) film.setTitre(str);
		else if(node.equals("genre")) film.setGenre(str);
		else if(node.equals("pays")) film.setPays(str);
		else if(node.equals("resume")) film.setResume(str);
		else if(node.equals("nom")) role.setNom(str);
		else if(node.equals("prenom")) role.setPrenom(str);
		else if(node.equals("intutile")) role.setIntitule(str);
			
	}
	
	
	public Films getFilms(){
		return films;
	}
	
	public void notationDecl(String name, String publicId, String systemId){
		System.out.println(name + " - "  + publicId + " - " + systemId);
	}
	public void error(SAXParseException e) throws SAXException {
		System.out.println("ERROR : " + e.getMessage());
		throw e;
	}
	
	public void fatalError(SAXParseException e) throws SAXException {
		System.out.println("FATAL ERROR : " + e.getMessage());
		throw e;
	}
	
	public void warning(SAXParseException e) throws SAXException {}
	

}
