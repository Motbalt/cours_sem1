package poo_cours;
public class Test_personne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Personne p1 = new Personne("thomas","Chemin des ortis",1200);
		p1.setNom("thomas"); //inutile mtn
		p1.setAdresse("Chemin des ortis"); //inutile mtn
		p1.setSalaire(1200); //inutile mtn
		
		System.out.println("nom = " + p1.getNom());
		System.out.println("adresse = " + p1.getAdresse());
		p1.setAdresse("coin coin les moulinaux");
		System.out.println(p1.getNom() + " a un salaire annuel de " + p1.salaireAnnuel());
		System.out.println(p1);
		if (p1.salaireIsSup1000()) {
			System.out.println(p1.getNom() + " a un salaire supérieur à 1000");
		}
		else {
			System.out.println(p1.getNom() + " n'a pas un salaire supérieur à 1000");
		}
		Personne p2 = new Personne("jean","macon",1400);
		System.out.println("masse salariale total : " + Personne.getMasseSalariale());
		p1.setSalaire(2200);
		System.out.println("masse salariale total : " + Personne.getMasseSalariale());
		System.out.println("Salaire moyen de l'entreprise : " + Personne.salaireMoyen());
		
		Personne p3 = new Personne("machin",2000);
		System.out.println(p3);
		Student tiomote = new Student ("timote", "coin coin les moulinaux", 2400, "2a2945892");
		System.out.println(tiomote.toString());
		*/
		Personne e1 = new Enseignant("marc", 1200, 45);
		Personne e2 = new Enseignant("enzo", 1800, 25);
		Student s1 = new Student("robert", "ici les ", 25,"25832");
		//e1.sePresenter();
		Universite corte = new Universite("univ");
		corte.ajoutMembre(e1);
		corte.ajoutMembre(e2);
		corte.ajoutMembre(s1);
		corte.showMembers();
	}

}
