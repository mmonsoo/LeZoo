package com.mmonsoor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class ExoCollections {

	public ExoCollections() {
		// TODO Auto-generated constructor stub
	}
	public static void start() {
		//#### Les conteneurs
				List <Integer> listeEntiers=new ArrayList<Integer>();
				listeEntiers.add(42);listeEntiers.add(100);listeEntiers.add(500);
				//La boucle For classique
				for(int i=0;i<listeEntiers.size();i++) {
					System.out.println(listeEntiers.get(i));
				}
				//La boucle ForEach
				for(int nb:listeEntiers) {
					System.out.println(nb);
				}
				//Avec des itérateurs
				Iterator <Integer> ite=listeEntiers.listIterator();
				while(ite.hasNext()) {
					System.out.println(ite.next());
				}
				//ca classe suivant suivant la table ASCII
				TreeSet <String> arbre=new TreeSet<String>();
				arbre.add("Zizou");
				arbre.add("Allo");
				arbre.add("DEL"); 
				arbre.add("~");
				arbre.add("aizou");
				arbre.add("Allo");
				arbre.add("10");
				arbre.add("5");
				arbre.add("1");
				arbre.add("!");
				arbre.add("#");
				arbre.add("@");
				arbre.add(">");
				arbre.add("<");
				arbre.add("=");
				arbre.add("NUL");
				
				//Un for each, ça ne prend pas les doublons
				for(String s:arbre) {
					System.out.println(s);
				}
		Chien chien1=new Chien("Rex","Doberman",(short) 14,"West Coast Dogs");
		Loup loup1=new Loup("Tom","Loup",(short) 18,"West Coast Wolves");
		//Les HashMap
		HashMap <String,Canide> listeCanide=new HashMap <String,Canide>();
		listeCanide.put("Enclos chien 1", chien1);
		listeCanide.put("Enclos loup 1", loup1);
		for(Map.Entry<String,Canide> pair:listeCanide.entrySet() ) {
			System.out.println("Dans l'enclos de "+pair.getKey()+" se trouve: "+pair.getValue().presentation());
		}
		List<String> ArrayDeStrings=new ArrayList<String>();
		ArrayDeStrings.add("je");
		ArrayDeStrings.add("suis");
		ArrayDeStrings.add("malade");
		for(String str:miseEnMajuscules(ArrayDeStrings)) {
			System.out.println(str);
		}
		List<String> LinkedListStrings=new LinkedList <String> ();
		LinkedListStrings.add("Let");
		LinkedListStrings.add("me");
		LinkedListStrings.add("brush");
		LinkedListStrings.add("your");
		LinkedListStrings.add("teeth");
		for(String str:miseEnMajuscules(LinkedListStrings)) {
			System.out.println(str);
		}
		List <Canide> listecanides=new ArrayList<Canide>();
		listecanides.add(new Chien("Rex","Doberman",(short) 14,"West Coast Dogs"));
		listecanides.add(new Loup("Tom","Loup",(short) 18,"West Coast Wolves"));
		//La généricité et du polymorphisme
		lire(listecanides);
		
		
		
	}
	public static void parcoursEnclos(HashMap<String,Canide> listeCanide) {
		
		for(Map.Entry<String,Canide> pair:listeCanide.entrySet() ) {
			System.out.println("Dans l'enclos de "+pair.getKey()+" se trouve: "+pair.getValue().presentation());
		}
	}
	public static List<String> miseEnMajuscules(List<String> listeDeStrings) {
		//On crée un itérateur
		for(int i=0;i<listeDeStrings.size();i++) {
			listeDeStrings.set(i, listeDeStrings.get(i).toUpperCase());
		}
/*	//
 * Iterator <String> str=listeDeStrings.listIterator();
 * List <String> newArrayString= new ArrayList <String> ();
		while(str.hasNext()) {
			newArrayString.add(str.next().toUpperCase());
		}
*/		
		return listeDeStrings;
	}
	//La généricité et du polymorphisme
	public static void lire(List<? extends Canide> list) {
		for(Canide c: list) {
			System.out.println(c.presentation());
		}
		
	}

}
