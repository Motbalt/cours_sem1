package exercice0;

public class TestDe {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	De de = new De();
	System.out.println(de.toString());
	int a = 50;
	de.setNbFaces(a);
	System.out.println(de.toString());
	a = 150;
	de.setNbFaces(a);
	System.out.println(de.toString());
	System.out.println(de.lance());
	
	System.out.println("Cr�ation d'un nouveau D�");
	De de2 = new De(44);
	System.out.println(de2.toString());
	
	De de3 = new DePipe(44, 42);
	System.out.println(de3.toString());
	System.out.println(de3.lance());
	
	System.out.println(de.equals(de3));
	System.out.println(de2==de3);
	System.out.println(de3==de3); //marche pas
	
	System.out.println("");
	
	//for (int n=0; n<10; n++) { syst�me de verification
	System.out.println("test d� pip� " + de3.lance(22));
	//}
	DeRemember de4 = new DeRemember();
	System.out.println(de4.lance());
	System.out.println(de4.lance());
	DeAutres de5 = new DeAutres();
	System.out.println(de5.lance());
	}
}
