package exercice0;
import java.util.*;

public class DePipe extends De {
	private static Random r = new Random();
	private int minimum;
	
	public DePipe(int nbfaces,int minimum) {
		super(nbfaces);
		this.minimum = minimum;
		// TODO Auto-generated constructor stub
	}

	public DePipe(int nbFaces, String nomDe) {
		super(nbFaces, nomDe);
		// TODO Auto-generated constructor stub
	}

	public DePipe(int nbFaces) {
		super(nbFaces);
		// TODO Auto-generated constructor stub
	}
	
	public int lance() {
		
		int nbAleatoire;
		do {
		nbAleatoire = r.nextInt(nbFaces) + 1;
		}while(nbAleatoire >= minimum);
		return nbAleatoire;		
	}

}
