public class LivreNumerique extends LivreAbstrait implements Empruntable {
    
    private String Format;
    
    public LivreNumerique(String titre, String auteur, int annee,String format){
        super(titre, auteur, annee);
        this.Format=format;
    }

    public String getFormat(){
        return Format;
    }

    @Override
    public void afficherDetails(){
        System.out.println("\n---------Livre Numérique--------\nTitre: "+ getTitre());
        System.out.println("Auteur: "+ getAuteur());
        System.out.println("Année du publication: "+ getAnneePublication());
        System.out.println("Format: "+ getFormat());
    
    } 
    
    @Override
    public void emprunter(){
        System.out.println("le livre "+ getTitre()+" est emprunté");
    }
    
    @Override
    public void retourner(){
        System.out.println("le livre "+ getTitre()+"  a été rendu");
    }

}
