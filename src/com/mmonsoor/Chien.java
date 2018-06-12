package com.mmonsoor;

public class Chien extends Canide {

	public Chien(String tmpNom, String tmpEspece, Short tmpAge, String tmpMeute) {
		super(tmpNom, tmpEspece, tmpAge, null, tmpMeute);
		// TODO Auto-generated constructor stub
	}
	
	public void rassemblerLaMeute() {
		System.out.println("J’aboie pour prévenir mon maitre");
	}


}
