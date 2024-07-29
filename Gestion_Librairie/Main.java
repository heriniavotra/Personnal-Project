
public class Main {
    public static void main(String[] args) {
        
        LivrePapier papier = new LivrePapier("La voie libre", "John", 1992, 100);
        LivreNumerique numerique = new LivreNumerique("Initiation en java", "Pierre", 2015, "PDF");
        
        
        Bibliotheque bibliotheque = new Bibliotheque();
        bibliotheque.ajouterLivre(numerique);
        bibliotheque.ajouterLivre(papier);

        Client client1 = new Client("toky");
        Client client2 = new Client("Milanto"); 
        
        bibliotheque.afficherBibliotheque();
        client1.retournerLivre(numerique);
        client2.emprunterLivre(papier);
        
    }
}