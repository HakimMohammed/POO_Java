package Exercice_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DossierContact contact = new DossierContact();
        Scanner sc = new Scanner(System.in);
        int choice;
        String name, phone_number;
        do {
            System.out.println("--------------------- Annuaire Téléphonique ----------------------------- \n" +
                    "Séléctionner une des opérations suivantes par taper son index : \n"+
                    "1 : Rechercher un numéro de téléphone \n" +
                    "2 : Ajouter un nouveau contact \n" +
                    "3 : Supprimer un contact \n" +
                    "4 : Changer le numéro de téléphone d’un contact \n" +
                    "5 : Quitter\n" +
                    "--------------------------------------------------------------------------------------");

            // Check if the input is an integer
            while (!sc.hasNextInt()) {
                System.out.println("Veuillez selectionnez une opération");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Saisir le nom du contact");
                    name = sc.nextLine();
                    contact.getContactByName(name);
                    name = null;
                    System.out.println("Frappez une touche pour revenir au menu.");
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("Saisir les informations du contact");
                    System.out.println("nom: ");
                    name = sc.nextLine();
                    System.out.println("phone number");
                    phone_number = sc.nextLine();
                    contact.addContact(name, phone_number);
                    name = null; phone_number = null;
                    System.out.println("Frappez une touche pour revenir au menu.");
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Saisir le nom du contact");
                    name = sc.nextLine();
                    contact.delContact(name);
                    name = null;
                    System.out.println("Frappez une touche pour revenir au menu.");
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println("Saisir les informations du contact");
                    System.out.println("nom: ");
                    name = sc.nextLine();
                    System.out.println("phone number");
                    phone_number = sc.nextLine();
                    contact.updateContact(name, phone_number);
                    name = null; phone_number = null;
                    System.out.println("Frappez une touche pour revenir au menu.");
                    sc.nextLine();
                    break;
                case 5:
                    System.out.println("Exiting ...");
                    break;
            }
        } while( choice != 5);
        sc.close();
    }
}
