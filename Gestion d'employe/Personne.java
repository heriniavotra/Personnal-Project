
abstract class Personne {

    protected String nom;
    protected String prenom;
    protected int age;

    public Personne(String nom, String prenom, int age) {

        this.nom = nom;
        this.prenom = prenom;
        this.age = age;

    }

    public String getNom(){return nom ;}
    public String getPrenom(){return prenom;}
    public int getAge(){return age;}

    public void setNom(String nom){this.nom=nom;}
    public void setPrenom(String prenom){this.prenom=prenom;}
    public void setNom(int age){this.age=age;}

    abstract void Afficher();
}