package Gestion_Inventaire;

public class Materiel extends Article {
    private int stock_mat;
    private String type;

    public Materiel(String nom, int stock){
        super(nom);
        this.stock_mat=stock;
        this.type="materiel";
    }

    @Override
    public int Stock(){
        return stock_mat;
    }

    @Override
    public String Categorie(){
        return type;
    }

    @Override
    public int AjoutStock(int quantite){
        return stock_mat+=quantite;
    }

    @Override
    public int RetireStock(int quantite_retire){
        if(stock_mat > quantite_retire){
            return stock_mat-=quantite_retire;
        }else{
            return stock_mat;
        }
    }

  
}
