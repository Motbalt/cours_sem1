package poo_cours;

public class Student extends Personne {
	private String numStud;
	
	public Student(String nom, double salaire,String numStud) {
		super(nom,"corte", salaire);
		this.numStud = numStud;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return super.toString() + "  numéro étudiant : " + numStud;
	}
	@Override
	void sePresenter() {
		// TODO Auto-generated method stub
		
	}
}
