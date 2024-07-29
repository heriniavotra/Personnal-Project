
abstract class Personnel extends Personne {
    
    protected Contrat contrat;

    public Personnel(String nom, String prenom, int age, Contrat contrat){
        
        super(nom, prenom, age);
        this.contrat=contrat;
    }

    public Contrat getContrat(){return contrat;}
    public void setContrat(Contrat contrat){this.contrat=contrat;}

    abstract void Afficher();


}
