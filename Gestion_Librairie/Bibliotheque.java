import java.util.ArrayList;

public class Bibliotheque {

    private ArrayList<LivreAbstrait> livres;

    public Bibliotheque(){
        livres= new ArrayList<>();
    }

    public void ajouterLivre(LivreAbstrait livre){
        livres.add(livre);
    }
 
    public void afficherBibliotheque(){

        for(LivreAbstrait livre: livres){
            livre.afficherDetails();
        }
        
    }

}
