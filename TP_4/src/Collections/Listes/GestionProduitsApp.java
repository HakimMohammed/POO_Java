package Collections.Listes;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionProduitsApp {
    public static void main(String[] args) {
        ArrayList<Produit> list = new ArrayList<Produit>();

        //Ajout des élément
        list.add(new Produit(10,"Produit 1",1000.0));
        list.add(new Produit(20,"Produit 2",2000.0));
        list.add(new Produit(30,"Produit 3",3000.0));
        // Afficher les produits
        System.out.println("Affichage après ajout des produits");
        list.forEach((e) -> System.out.println(e));

        // Suppressions
        list.remove(2);
        // Afficher les produits
        System.out.println("\nAffichage après suppression");
        list.forEach((e) -> System.out.println(e));

        // Modification
        list.set(0, new Produit(10,"Produit A",1500.0));
        // Afficher les produits
        System.out.println("\nAffichage après modification");
        list.forEach((e) -> System.out.println(e));

        // Recherche
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le nom du produit que vous voulez");
        String search = sc.nextLine().strip();
        list.forEach((e) -> {
            if(e.getNom().contains(search)) {
                System.out.println(e);
            }
        });

    }
}
