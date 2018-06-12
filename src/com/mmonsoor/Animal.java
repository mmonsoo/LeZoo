package com.mmonsoor;

public abstract class Animal {
	
	protected String nom;
	protected String espece;
	protected Short age;
	protected Territoire territoire;
	
	public Animal(String tmpNom, String tmpEspece, Short tmpAge,Territoire tmpTerritoire) {
		// TODO Auto-generated constructor stub
		nom=tmpNom;
		espece=tmpEspece;
		age=tmpAge;
		territoire=tmpTerritoire;
	}
	
	public Short getAge() {
		return age;
	}

	public void setAge(Short age) {
		this.age = age;
	}

	public Animal() {
		// TODO Auto-generated constructor stub
		nom="";
		espece="";
		age=0;
		territoire=null;
	}
	
	

	/**
	 * Retourne un String avec les attributs de l'animal
	 */
	
	public String presentation() {
		if(territoire==null) {
			
			return("Bonjour je suis "+nom+", "+"je suis un "+espece+" et j'ai "+age+" ans !"+"Et je n'ai pas encore de territoire attribué.");
			
		}
		else {
			
			return("Bonjour je suis "+nom+", "+"je suis un "+espece+" et j'ai "+age+" ans !"+"Et mon territoire est "+territoire.getType());
			
		}
		
	}
	
	public void setTerritoire(Territoire ter) {
		territoire=ter;
	}

}
