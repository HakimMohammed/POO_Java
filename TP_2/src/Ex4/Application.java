package Ex4;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        MetierProduitImpl metierProduit = new MetierProduitImpl();
        Scanner sc = new Scanner(System.in);
        String input = "";
        int choice;
        do {
            System.out.println("--------------------- Produit Metier ----------------------------- \n" +
                    "Séléctionner une des opérations suivantes par taper son index : \n"+
                    "1 : Afficher la liste des produits \n" +
                    "2 : Rechercher des produits par un mot clé\n" +
                    "3 : Ajouter un nouveau produit dans la liste. \n" +
                    "4 : Récupérer et afficher un produit par ID.\n" +
                    "5 : Supprimer un produit par id.\n" +
                    "6 : Quitter");

            // Check if the input is an integer
            while (!sc.hasNextInt()) {
                System.out.println("Veuillez selectionnez une opération");
                sc.next();
            }
            choice = sc.nextInt();

            //Without This Magical Line it will automatically jumps to other option When choosing 1
            sc.nextLine();

            switch (choice) {
                case 1:
                    metierProduit.getAll().forEach(System.out::println);
                    break;
                case 2:
                    String searchTerm = "";
                    System.out.println("Saisir le mot clé");
                    searchTerm = sc.nextLine();
                    metierProduit.findByNom(searchTerm).forEach(System.out::println);
                    break;
                case 3:
                    String nom, marque, description = "";
                    System.out.println("Siaisr le nom du produit:");
                    nom = sc.nextLine();
                    System.out.println("Siaisr la marque du produit:");
                    marque = sc.nextLine();
                    System.out.println("Siaisr la description du produit");
                    description = sc.nextLine();

                    Random rand = new Random();
                    Produit p = new Produit(rand.nextInt(), rand.nextInt(), nom, marque, description, rand.nextDouble());

                    metierProduit.addProduit(p);
                    break;
                case 4:
                    int id_search = 0;
                    System.out.println("Saisir l'id à rechercher");
                    id_search = sc.nextInt();
                    System.out.println(metierProduit.findById(id_search));
                    break;
                case 5:
                    int id_del = 0;
                    System.out.println("Saisir l'id à supprimer");
                    id_del = sc.nextInt();
                    metierProduit.delete(id_del);
                    System.out.println("Produit supprimé");
                    break;
            }
        } while( choice != 6);
        sc.close();
    }
}