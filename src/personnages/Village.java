package personnages;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] villageois;

	public Village(String nom, int nbHabitantsMax, Gaulois chef) {
		this.nom = nom;
		this.villageois = new Gaulois[nbHabitantsMax];
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		// TODO Auto-generated method stub
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}

	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois >= 1 && numVillageois <= nbVillageois) {
			return villageois[numVillageois - 1];
		} else {
			System.out.println("Il n'y a pas autant d'habitants dans notre village !");
			return null;
		}
	}
	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", 30, abraracourcix);
		//Gaulois gaulois = village.trouverVillageois(30);
		Gaulois asterix =new Gaulois("Atserix", 8);
		village.ajouterVillageois(asterix);
		
		Gaulois gaulois = village.trouverVillageois(1);
		 System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		 System.out.println(gaulois);
		 
	}

}
