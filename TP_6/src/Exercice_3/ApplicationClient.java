package Exercice_3;

import Exercice_3.metier.MetierClientImpl;
import Exercice_3.models.Client;

import java.util.List;
import java.util.Scanner;

public class ApplicationClient {
    public static void main(String[] args) {

        MetierClientImpl metier = new MetierClientImpl();

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("""
                    --------------------- Client Manager -----------------------------\s
                    Séléctionner une des opérations suivantes par taper son index :\s
                    1 : Afficher la liste des clients\s
                    2 : Rechercher un client par son nom\s
                    3 : Ajouter un nouveau client\s
                    4 : Supprimer un client par nom\s
                    5 : Sauvegarder les clients
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
                    List<Client> clients = metier.getAll();
                    for(Client client: clients) {
                        System.out.println(client);
                    }
                    break;
                case 2:
                    System.out.println("Saisir le nom du client que vous cherchez");
                    String keyword = sc.nextLine();
                    Client client = metier.findByNom(keyword);
                    System.out.println(client);
                    keyword = null;
                    break;
                case 3:
                    System.out.println("Siaisr les informations du client");
                    System.out.println("nom:");
                    String nom = sc.nextLine();
                    System.out.println("prenom:");
                    String prenom = sc.nextLine();
                    System.out.println("addresse");
                    String addresse = sc.nextLine();
                    System.out.println("email");
                    String email = sc.nextLine();
                    System.out.println("tel");
                    String tel = sc.nextLine();
                    Client newClient = new Client(nom, prenom, addresse, email, tel);
                    metier.add(newClient);
                    break;
                case 4:
                    System.out.println("Saisir le nom du client que vous cherchez");
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
