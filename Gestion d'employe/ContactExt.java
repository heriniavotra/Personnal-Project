public class ContactExt extends Personne {
    
    protected TypeContact type;

    public ContactExt(String nom, String prenom, int age, TypeContact type){
        super(nom, prenom, age);
        this.type=type;
    }

    public TypeContact getType(){return type;}

    public void setContact(TypeContact type){this.type=type;}

    public void Afficher(){
        System.out.println("Contact exterieur:");
        System.out.println("nom:"+nom+"\nprenom:"+prenom+"\nAge:"+age+"\type de contact:"+type.toString());

    };

}
