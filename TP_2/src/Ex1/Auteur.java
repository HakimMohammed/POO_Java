package Ex1;

public class Auteur extends Personne {
    private int numAuteur;

    public Auteur(String nom, String prenom, String email, String tel, int age, int numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }

    @Override
    public void afficher(){
        System.out.println("---------- Auteur -------------");
        super.afficher();
        System.out.println("Numéro d'auteur: " + numAuteur);
        System.out.println("------------------------------");
    }
}
