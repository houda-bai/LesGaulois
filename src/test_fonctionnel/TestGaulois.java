package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois gaulois = new Gaulois("Astérix", 8);
		Gaulois gaulois1 = new Gaulois("Obélix", 16);
		
		gaulois.parler("Bonjour Obélix.");
		gaulois.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?)");
		gaulois.parler("Oui très bonne idée.");

	}
}
