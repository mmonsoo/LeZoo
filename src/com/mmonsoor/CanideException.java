package com.mmonsoor;

public class CanideException extends Animal implements Carnivore  {

	public CanideException(String tmpNom, String tmpEspece, Short tmpAge, Territoire tmpTerritoire)  throws AgeNegatifException  {
		//super(tmpNom, tmpEspece, tmpAge, tmpTerritoire);
		// TODO Auto-generated constructor stub
		nom=tmpNom;
		espece=tmpEspece;
		territoire=tmpTerritoire;
		if (tmpAge>0) {
			age=tmpAge;
		}
		else {
			throw new AgeNegatifException();
		}
		
	}

	public void setAgeException(Short age) throws AgeNegatifException {
		// TODO Auto-generated method stub
		if(age >0) {
			this.age=age;
		}
		else {
			throw new AgeNegatifException();
		}
		super.setAge(age);
	}


	public CanideException() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String chasser() {
		// TODO Auto-generated method stub
		return "Je chasse en meute";
	}
	
}
