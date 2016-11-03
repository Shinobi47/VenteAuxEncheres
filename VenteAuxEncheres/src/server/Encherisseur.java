package server;
import java.io.Serializable;


public class Encherisseur implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String Nom;
	private String Prenom;
	
	public Encherisseur(){
		
	}
	public Encherisseur(String nom, String prenom) {
		super();
		Nom = nom;
		Prenom = prenom;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	

}
