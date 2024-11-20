package Ex3;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Categorie work = new Categorie("work","good for work places",new ArrayList<Ordinateur>());

        Ordinateur ordinateur1 = new Ordinateur("ordinateur1", "acer","Laptop",15000.00,10,work);
        Ordinateur ordinateur2 = new Ordinateur("ordinateur2", "thinkpad","Laptop",7000.00,20,work);
        Ordinateur ordinateur3 = new Ordinateur("ordinateur3", "apple","MacBook M2",20000.00,3,work);

        work.ajouterOrdinateur(ordinateur1);
        work.ajouterOrdinateur(ordinateur2);
        work.ajouterOrdinateur(ordinateur3);

        Client client1 = new Client("Jhon", "Doe","Casablanca","example@gmail.com","Casablanca","0611223344",new ArrayList<>());

        Commande commande1 = new Commande("aaa", client1,new Date(),false);

        client1.ajouterCommande(commande1);

        LigneCommande ligne1 = new LigneCommande(5, commande1, ordinateur1);
        LigneCommande ligne2 = new LigneCommande(10, commande1, ordinateur2);
        LigneCommande ligne3 = new LigneCommande(1, commande1, ordinateur3);

        System.out.println(commande1);
        System.out.println(ligne1);
        System.out.println(ligne2);
        System.out.println(ligne3);



    }
}