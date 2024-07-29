
class LivrePapier extends LivreAbstrait implements Empruntable{
    
    private int NombrePages;  
    
    public LivrePapier(String titre, String auteur, int annee,int nbr){
        super(titre, auteur, annee);
        this.NombrePages=nbr;
    }
    
    public int getNombrePage(){
        return NombrePages;
    }

    @Override
    public void afficherDetails(){
        System.out.println("\n---------Livre Papier--------\nTitre: "+ getTitre());
        System.out.println("Auteur: "+ getAuteur());
        System.out.println("Année du publication: "+ getAnneePublication());
        System.out.println("Nmobres de pages: "+ getNombrePage());

    }    

    @Override
    public void emprunter(){
        System.out.println("le livre "+ getTitre()+" est emprunté");
    }
    
    @Override
    public void retourner(){
        System.out.println("le livre "+ getTitre()+" a été rendu");
    }
}
