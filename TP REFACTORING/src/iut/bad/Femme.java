package iut.bad;

public class Femme extends Humain {
    private String nom;
    private String prenom;
    private int age;

   
    public Femme() {
    }

    
    public Femme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    
    public static void main(String[] args) {
        
        Homme homme = new Homme("Doe", "John", 30);
        Femme femme = new Femme("Doe", "Jane", 28);

        
       homme.ami(femme);
       femme.ami(homme);
    }
}
