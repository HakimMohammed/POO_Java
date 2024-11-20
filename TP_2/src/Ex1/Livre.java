package Ex1;

public class Livre {
    private int ISBN;
    private Auteur auteur;
    private String titre;

    public Livre(int ISBN, Auteur auteur, String titre) {
        this.ISBN = ISBN;
        this.auteur = auteur;
        this.titre = titre;
    }

    public void afficher() {
        System.out.println("---------- Livre -------------");
        System.out.println("ISBN :" + ISBN);
        System.out.println("Titre :"+ titre);
        auteur.afficher();
        System.out.println("------------------------------");
    }
}
