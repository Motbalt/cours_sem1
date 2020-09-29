package tableau;

class Client {
	String nom;
	int age;
	public Client(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	public String toString() {
		return nom + " ( " + age + "ans)";
		}
}