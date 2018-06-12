package com.mmonsoor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
		Territoire territoire1=new Territoire("Savane",10000);
		Territoire territoire2=new Territoire("Nantes",1000);
		Territoire territoire3=new Territoire("Forêt indienne",1000000);
		Territoire territoire4=new Territoire("Les Ulis",1000000);
		//System.out.println(territoire1.presentation());
		//Un animal général
		//On ne peut plus instancier les animaux
		//Animal animal=new Animal("Simba","Lion",(short) 5,territoire1);	
		//La création d'un oiseau
		Oiseau oiseau1=new Oiseau("Robert","Moineau",(short) 2,"Nid douillet");
		//System.out.println(oiseau1.voler());
		oiseau1.setTerritoire(territoire2);
		//System.out.println(oiseau1.presentation());
		//On va créer un chien
		Chien chien1=new Chien("Rex","Doberman",(short) 14,"West Coast Dogs");
		//System.out.println(chien1.presentation());
		chien1.setTerritoire(territoire4);
		//System.out.println(chien1.presentation());
		//chien1.rassemblerLaMeute();
		//On va créer un loup
		Loup loup1=new Loup("Tom","Loup",(short) 18,"West Coast Wolves");
		//System.out.println(loup1.presentation());
		loup1.setTerritoire(territoire3);
		//System.out.println(loup1.presentation());
		//loup1.rassemblerLaMeute();
		//Création d'une ArrayList d'animaux
		List <Animal> liste_animaux=new ArrayList<Animal>(Arrays.asList(oiseau1,chien1,loup1));
		//Méthode for Each
		for(Animal a:liste_animaux) {
			System.out.println(a.presentation()+"\n\n");
		}
		//Création d'un ArrayListe de canides
		List <Canide> liste_canides=new ArrayList<Canide>(Arrays.asList(chien1,loup1));
		for(Canide c:liste_canides) {
			c.rassemblerLaMeute();
		}
		
		Felin felin1=new Felin("Baguera", "Panthère", (short) 15, territoire3);
		//On va créer une liste de carnivore
		List <Carnivore> liste_carnivore=new ArrayList <Carnivore>();
		liste_carnivore.add(loup1);
		liste_carnivore.add(chien1);
		liste_carnivore.add(felin1);
		for(Carnivore c:liste_carnivore) {
			System.out.println(c.chasser());
		}
	
		ExoCollections.start();
		
//####### Les exceptions niveau deux
		
		try {
			int a=10, b=0;
			System.out.println(a/b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/		
		System.out.println("Suite du programme sans interuption");
		Territoire territoire3=new Territoire("Forêt indienne",1000000);
		try {
			CanideException loupException=new CanideException("MonPetitLoup", "Loup", (short) 20, territoire3);
			loupException.setAgeException((short) -20);
		} catch (AgeNegatifException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
