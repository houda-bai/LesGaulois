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
		this.nbVillageois = 0;
		this.chef.setVillage(this); 
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		gaulois.setVillage(this);
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

	public void afficherVillage() {
		System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom());
		System.out.println("vivent les legendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irreductibles", 30, abraracourcix);
		Gaulois asterix = new Gaulois("Atserix", 8);
		village.ajouterVillageois(asterix);

		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		
		village.afficherVillage();
		abraracourcix.sePresenter();    
		asterix.sePresenter(); 
		
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterVillageois(obelix);
		village.afficherVillage();
		
	    Gaulois doublepolemix = new Gaulois("Doublepolemix", 4);
	    doublepolemix.sePresenter();
	} // hnaya s'affihce pas as they want us to do
	//Gaulois [nom=Atserix, force=8]
	//Il n'y a pas autant d'habitants dans notre village !
	//null

}
