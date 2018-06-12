package com.mmonsoor;

public class Oiseau extends Animal {

	protected String nid;
	public Oiseau(String tmpNom, String tmpEspece, Short tmpAge, String tmpNid) {
		super(tmpNom, tmpEspece, tmpAge, null);
		// TODO Auto-generated constructor stub
		nid=tmpNid;
	}
	public Oiseau() {
		// TODO Auto-generated constructor stub
	}
	
	public String presentation() {
		String s=super.presentation();
		s+="\nMon nid est:"+nid;
		return(s);
	}
	
	public String voler() {
		return("Je vole");
	}

}
