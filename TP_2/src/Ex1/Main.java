package Ex1;

public class Main {
    public static void main(String[] args) {
        Adherent adherent = new Adherent("Jhon", "Doe","email@example.com","0611223344",35,15);
        Auteur auteur = new Auteur("Mustafa","Mahmoud","mustapha@mahmoud.com","0699887766",87,1);
        Livre livre = new Livre(10, auteur,"The Devils Rules");

        adherent.afficher();
        livre.afficher();
    }
}
