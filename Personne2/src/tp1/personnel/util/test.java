package tp1.personnel.util;
import java.util.GregorianCalendar;

public class test {
	public static void main(String[] args) {
		GregorianCalendar date1 = new GregorianCalendar(2000, 9, 6);
		GregorianCalendar date2 = new GregorianCalendar(2000, 9, 30);
		Adresse a1 = new Adresse("20600", "bastia");
		Personne p1 = new Personne("Dubois", "Thomas",date1,a1);
		Personne p2 = new Personne("Zampo", "enzo",date2,a1);
		p1.plusAgee(p2, p1);
		}	
}