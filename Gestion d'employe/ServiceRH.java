import java.util.ArrayList;

public class ServiceRH {
    
    protected String nomUniv;
    protected  ArrayList<Personne> listePersonne;

    public ServiceRH(String nom){
        this.nomUniv=nom;
        this.listePersonne=new ArrayList<>();
    }

    public String getNomUniv(){return nomUniv;}
    public void setNomUniv(String nom){this.nomUniv=nom;}

    public void ajouterPersonne(Personne p){listePersonne.add(p);}
    public void nbrPersonne(){listePersonne.size();}
    public void afficherPersonne(){
        for(Personne personne : listePersonne){
            personne.Afficher();
            System.out.println("----");
        }
    }


}
