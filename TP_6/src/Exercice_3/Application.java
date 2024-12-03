package Exercice_3;

import Exercice_3.metier.MetierProduitImpl;
import Exercice_3.models.Produit;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        MetierProduitImpl metier = new MetierProduitImpl();

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("""
                    --------------------- Product Manager -----------------------------\s
                    Séléctionner une des opérations suivantes par taper son index :\s
                    1 : Afficher la liste des produits\s
                    2 : Rechercher un produit par son nom\s
                    3 : Ajouter un nouveau produit\s
                    4 : Supprimer un produit par nom\s
                    5 : Sauvegarder les produits
                    6 : Quitter
                    --------------------------------------------------------------------------------------""");

            // Check if the input is an integer
            while (!sc.hasNextInt()) {
                System.out.println("Veuillez selectionnez une opération");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    List<Produit> products = metier.getAll();
                    for(Produit produit: products) {
                        System.out.println(produit);
                    }
                    break;
                case 2:
                    System.out.println("Saisir le nom du produit que vous cherchez");
                    String keyword = sc.nextLine();
                    Produit produit = metier.findByNom(keyword);
                    System.out.println(produit);
                    keyword = null;
                    break;
                case 3:
                    System.out.println("Siaisr les informations du produits");
                    System.out.println("nom:");
                    String nom = sc.nextLine();
                    System.out.println("marque:");
                    String marque = sc.nextLine();
                    System.out.println("description");
                    String description = sc.nextLine();
                    System.out.println("prix");
                    Double prix = sc.nextDouble();
                    System.out.println("nombre dans stock");
                    Integer nombre_stock = sc.nextInt();
                    Produit product = new Produit(nom, marque, description, prix, nombre_stock);
                    metier.add(product);
                    break;
                case 4:
                    System.out.println("Saisir le nom du produit que vous cherchez");
                    keyword = sc.nextLine();
                    metier.delete(keyword);
                    break;
                case 5:
                    metier.saveAll();
                    break;
                case 6:
                    System.out.println("Exiting ...");
                    break;
            }
        } while( choice != 6);
        sc.close();
    }
}
