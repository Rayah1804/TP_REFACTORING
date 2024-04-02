package iut.bad;

public class Humain {
    protected String nom;
    protected String prenom;
    protected int age;
    
   
    public Humain() {
    }
    
   
    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    
    
    public String toString() {
        return "Nom: " + nom + "\nPrénom: " + prenom + "\nÂge: " + age;
    }
}
//Si on décide de déplacer la méthode `toString()` vers les sous-classes `Homme` et `Femme`,
//chaque sous-classe aurait sa propre implémentation de la méthode `toString()`.
// Cela peut être approprié si chaque sous-classe a des détails spécifiques à afficher.
// Cependant, si les détails à afficher sont les mêmes pour toutes les sous-classes