package com.mmonsoor;

public class Felin extends Animal implements Carnivore {

	
	public Felin(String tmpNom, String tmpEspece, Short tmpAge, Territoire tmpTerritoire) {
		super(tmpNom, tmpEspece, tmpAge, tmpTerritoire);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String chasser() {
		// TODO Auto-generated method stub
		return "Je chasse seul";
	}
	
	

}
