package exercice0;
import java.util.*;
public class DeAutres extends De {

	public DeAutres() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeAutres(int nbFaces, String nomDe) {
		super(nbFaces, nomDe);
		// TODO Auto-generated constructor stub
	}

	public DeAutres(int nbFaces) {
		super(nbFaces);
		// TODO Auto-generated constructor stub
	}

	public String afficher(int nbAleatoire) {
		List<String> liste =  new ArrayList<String>() ;
		liste.add("refus�");
		liste.add("gagner");
		liste.add("Relance !");
		liste.add("Passe ton tour");
		return liste.get(nbAleatoire);
	}
}
