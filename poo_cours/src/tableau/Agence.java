package tableau;

public class Agence {
	private String directeur;
	private String adresse;
	private int nbClients = 0 ;
	Client[] lesClients;
	
	public Agence( String directeur) {
		this.directeur= directeur;
		lesClients = new Client[500];
	}
	public void ajouterUnClient(Client unClient) {
		lesClients[nbClients] = unClient;
		nbClients ++ ;
	}
	public void afficherClient() {
		for (int i= 0; i < nbClients;i++) {
			System.out.print(lesClients[i]);
			}
		}
	}

