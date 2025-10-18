package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.village = null;
	}

	public String getNom() {
		return nom;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup de la machoire de " + romain.getNom());
		int forceCoup = (force * effetPotion) / 3;
		romain.recevoirCoup(forceCoup);
		if (effetPotion > 1) {
			effetPotion--;
		}
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois decuplee.");
	}

	public static void main(String[] args) {
		Gaulois gauloix = new Gaulois("Asterix", 8);
		System.out.println(gauloix.getNom());
	}

	public void sePresenter() {

		if (this.village != null && this.village.getChef() == this) {
			parler("Bonjour, je m'appelle " + nom + ". Je suis le chef du village " + village.getNom() + ".");
		} else if (this.village != null) {
			parler("Bonjour, je m'appelle " + nom + ". J'habite le village " + village.getNom() + ".");
		} else {
			parler("Bonjour, je m'appelle " + nom + ". Je voyage de villages en villages.");
		}

	}

}
