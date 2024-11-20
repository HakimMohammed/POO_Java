package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = "";
        int choice;
        do {
            System.out.println("--------------------- String Editor ----------------------------- \n" +
                    "Séléctionner une des opérations suivantes par taper son index : \n"+
                    "1 : Saisir \n2 : Afficher \n3 : Inverser \n4 : Nombre des mots \n5 : Quitter");

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
                    System.out.println("Saisir une chaine de caractère");
                    input = sc.nextLine();

                    // Wait for user's input
                    System.out.println("Frappez une touche pour revenir au menu.");
                    sc.nextLine();
                    break;
                case 2:
                    if(input.isEmpty()) {
                        System.out.println("Veuillez d'abord saisir une chaine");
                    } else {
                        System.out.println("Chaine Saisie :");
                        System.out.println(input);

                        // Wait for user's input
                        System.out.println("Frappez une touche pour revenir au menu.");
                        sc.nextLine();
                    }
                    break;
                case 3:
                    if(input.isEmpty()) {
                        System.out.println("Veuillez d'abord saisir une chaine");
                    } else {
                        String reversed = StringEditor.reverse(input);
                        System.out.println("Chaine inversé :");
                        System.out.println(reversed);

                        // Wait for user's input
                        System.out.println("Frappez une touche pour revenir au menu.");
                        sc.nextLine();
                    }
                    break;
                case 4:
                    if(input.isEmpty()) {
                        System.out.println("Veuillez d'abord saisir une chaine");
                    } else {
                        int nbWords = StringEditor.countWords(input);
                        System.out.println("Nombre des mots : "+nbWords+"");

                        // Wait for user's input
                        System.out.println("Frappez une touche pour revenir au menu.");
                        sc.nextLine();
                    }
                    break;
                case 5:
                    System.out.println("Exiting ...");
                    break;
            }
        } while( choice != 5);
        sc.close();
    }
}