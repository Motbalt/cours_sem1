package tableau;

public class TestAgence {
	public static void main(String[] args) {
	Agence napoleon = new Agence("napoImmo");
	Client cli1 = new Client("toto", 32); //Cr�ation d'un client
	Client cli2 = new Client("armut", 24); //Cr�ation d'un client
	napoleon.ajouterUnClient(cli1);
	napoleon.ajouterUnClient(cli2);
	System.out.print(cli1.toString());
	System.out.println(cli2.toString());
	napoleon.afficherClient();
}
}