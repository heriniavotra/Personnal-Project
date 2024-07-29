public class Administratif extends Personnel{
    
    protected Poste poste;

    public Administratif(String nom, String prenom, int age, Contrat contrat, Poste poste){
        super(nom, prenom, age, contrat);
        this.poste=poste;
    }

    public Poste getPoste(){return poste;}
    public void setPoste(Poste poste){this.poste=poste;}

    void Afficher(){
        System.out.println("nom:"+nom+"\nprenom:"+prenom+"\nAge:"+age+"\nContrat:"+contrat.toString()+"\nPoste:"+poste.toString());
    }
}
