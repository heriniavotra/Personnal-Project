public class Client {

    public String Nom;

    public Client(String nom){
        this.Nom= nom;
    }

    public void getNom(){
       System.out.println(Nom);
    }

    public void emprunterLivre(Empruntable livre){
        livre.emprunter(); 
    }
    
    public void retournerLivre(Empruntable livre){
        livre.retourner();
    }
}
