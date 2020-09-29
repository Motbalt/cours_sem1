package poo_cours;

import java.util.ArrayList;

public class Universite{
	private String titre;
	ArrayList<Personne> membres;

		public Universite(String titre) {
			this.membres = new ArrayList<>();
			this.titre = titre;
		}
		public void ajoutMembre(Personne p) {
			membres.add(p);
		}
		public void showMembers() {
			//for (int i = 0; i < membres.size() ; i++){
			for (Personne var:membres) {
				System.out.println(var);
			}
		}
		
}
