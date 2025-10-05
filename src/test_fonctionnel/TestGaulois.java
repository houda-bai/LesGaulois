package test_fonctionnel;

import java.util.Iterator;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois astérix = new Gaulois("Astérix", 8);
		Gaulois obélix = new Gaulois("Obélix", 16);
		Romain minus = new Romain("Minus", 6);

		astérix.parler("Bonjour Obélix.");
		astérix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?)");
		astérix.parler("Oui tr�s bonne idée.");

		System.out.println("Dans la forêt" + astérix.getNom() + " et " + obélix.getNom()
				+ " tombent nez à sur le romain " + minus.getNom() + ".");

		for (int i = 0; i < 3; i++) {
			astérix.frapper(minus);
		}
		
		 Romain brutus = new Romain("Brutus", 14);
	     Druide panoramix = new Druide("Panoramix", 2);

	     panoramix.fabriquerPotion(4, 3);
	        
	     panoramix.booster(obélix);  // 
	     panoramix.booster(astérix); // 
	     for (int i = 0; i < 3; i++) {
	            astérix.frapper(brutus);
	      
	    }
	}
}
