public class Enseignant extends Personnel {
    
    protected Grade grade;

    public Enseignant(String nom, String prenom, int age,Contrat contrat, Grade grade){
        super(nom, prenom, age, contrat);
        this.grade=grade;
    }

    public Grade getGrade(){return grade;}
    public void setGrade(Grade grade){this.grade=grade;}

    void Afficher(){
        System.out.println("nom:"+nom+"\nprenom:"+prenom+"\nAge:"+age+"\nContrat:"+contrat.toString()+"\nGrade:"+grade.toString());
    }
}
