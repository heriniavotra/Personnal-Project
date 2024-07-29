package Gestion_Inventaire;

public class Produit extends Article {

    private int stock_prod;
    private String type ;

    public Produit(String nom, int stock){
        super(nom);
        this.stock_prod=stock;
        this.type="produit";
    }

    @Override
    public int Stock(){
        return stock_prod;
    }

    @Override
    public String Categorie(){
        return type;
    }

    @Override
    public int AjoutStock(int quantite_ajoute){
        return stock_prod+=quantite_ajoute;
    }
    
    @Override
    public int RetireStock(int quantite_retire){
        if(stock_prod > quantite_retire){
            return stock_prod-=quantite_retire;
        }else{
            return stock_prod;
        }
    }

}
