package poo_cours;

public class Enseignant extends Personne {
	int nbheures;
	//Constructor
	public Enseignant(String nom,double salaire, int nbheure) {
		super(nom,salaire);
		this.nbheures = nbheure;
		// TODO Auto-generated constructor stub
	}
	//methodes
	public void sePresenter() {
		 System.out.println("bonjour je suis votre nouvel enseignant M." + nom + "et j'ai"
				 + nbheures + " heures avec vous");
	}
}
