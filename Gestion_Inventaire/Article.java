package Gestion_Inventaire;

abstract class Article {

    private String nom;

    public Article (String nom){
        this.nom=nom;
    }

    public String Nom(){
        return nom;
    }

    public abstract int Stock();
    public abstract String Categorie();
    public abstract int AjoutStock(int quantite_ajoute);
    public abstract int RetireStock(int quantite_retire);
   

}
    
