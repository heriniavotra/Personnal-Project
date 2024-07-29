abstract class LivreAbstrait implements Livre {

    private String Titre;
    private String Auteur;
    private int AnneePub;

    public LivreAbstrait(String titre, String auteur, int annee) {
        this.Titre = titre;
        this.Auteur = auteur;
        this.AnneePub = annee;
    }

    
    public String getTitre(){
        return Titre;
    }
        
    public String getAuteur(){
        return Auteur;
    }
    
    public int getAnneePublication(){
        return AnneePub;
    }

    public abstract void afficherDetails();
}
