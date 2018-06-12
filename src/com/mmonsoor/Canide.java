package com.mmonsoor;

public abstract class Canide extends Animal implements Carnivore {
	protected String meute;

	public Canide(String tmpNom, String tmpEspece, Short tmpAge, Territoire tmpTerritoire,String tmpMeute) {
		super(tmpNom, tmpEspece, tmpAge, tmpTerritoire);
		meute=tmpMeute;
		// TODO Auto-generated constructor stub
	}
	
	public String presentation() {
		String s=super.presentation();
		s+="\nLe nom de la meute est:"+meute;
		return(s);
	}
	
	public void rassemblerLaMeute() {
		System.out.println("Je fais du bruit pour rassembler la meute");
	}

	@Override
	public String chasser() {
		// TODO Auto-generated method stub
		return "Je chasse en meute";
	}
	

	

}
