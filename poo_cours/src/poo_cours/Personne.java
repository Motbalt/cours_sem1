package poo_cours;
abstract class Personne {
	
	protected String nom;
	protected String adresse;
	protected double salaire = 0;
	private double ancienSalaire = 0;
	private static final double SMIC = 1219;
	private static double masseSalariale = 0;
	private static int nbPersonnes = 0;
	
	//Constructeur
	public Personne(String nom, String adresse, double salaire) {
		this.nom=nom;
		this.adresse=adresse;
		this.setSalaire(salaire);
		nbPersonnes++;
	}
	
	public Personne(String nom, double salaire) {
		this(nom, "<non communiqu�>", salaire);
	}
	//D�claration des variables
	public void setNom(String nom) {
	this.nom=nom;
	}
	public void setAdresse(String adresse) {
	this.adresse=adresse;
	}
	public void setSalaire(double salaire) {
		masseSalariale = masseSalariale - this.salaire;
		if (salaire < SMIC) {
			this.salaire = SMIC;
		}
		else {
			this.salaire=salaire;
		}
		this.masseSalariale = this.masseSalariale + this.salaire ;//- ancienSalaire;
		ancienSalaire = salaire;
	}
	// R�cup�ration des variables
	public String getNom() {
	return this.nom;
	}
	public String getAdresse() {
	return this.adresse;
	}
	public double getSalaire() {
	return this.salaire;
	}
	public static double getMasseSalariale() {
		return masseSalariale;
	}
	public static int getnbPersonnes() {
		return nbPersonnes;
	}
	
	public static double salaireMoyen() {
		return masseSalariale / nbPersonnes;
	}
	
	
	public String toString() {
	return "Monsieur "+ nom + " r�sidant � " + adresse + " ayant un salaire de : " + salaire;
	}
	public double salaireAnnuel() {
		double result = this.salaire * 12;
		return result;
	}
	public boolean salaireIsSup1000() {
		return (this.salaire>1000);
	}
	abstract void sePresenter();
}