package Streams.Ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Same list as the one in the cours
        List<String> liste = List.of("Java", "Stream", "Example", "String");

        // Question 1
        System.out.println("\nFiltrer les mots qui contient la lettre a");
        List<String> res_q1 = liste.stream()
                .filter(word -> word.contains("a"))
                .collect(Collectors.toList());
        System.out.println(res_q1);

        // Question 2
        System.out.println("\nFiltrer les mots qui ont une longueur supérieure à 3 et transformer chaque mot en son inverse.");
        List<String> res_q2 = liste.stream()
                .filter(word -> word.length() >= 3)
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(res_q2);

        // Question 3
        System.out.println("\nFiltrer les chaînes qui contiennent la lettre \"e\" et aplatir chaque chaîne en une liste de ses caractères.");
        List<String> rep_q3 = liste.stream()
                .filter(word -> word.contains("e"))
                .map(word -> Arrays.toString(word.split(""))).toList();
        System.out.println(rep_q3);

        // Question 4
        System.out.println("\nTransformer chaque chaîne en sa version en majuscules.");
        List<String> rep_q4 = liste.stream()
                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(rep_q4);

        // Question 5
        System.out.println("\nConvertir chaque chaîne en sa longueur.");
        List<Integer> rep_q5 = liste.stream()
                .map(word -> word.length())
                .collect(Collectors.toList());
        System.out.println(rep_q5);

        // Question 6
        System.out.println("\nTransformer chaque chaîne en une liste de ses caractères, puis aplatir toutes les listes en une seule liste de caractères.");
        List<String> rep_q6 = liste.stream()
                .flatMap(word -> Arrays.stream(word.split("")))
                .collect(Collectors.toList());
        System.out.println(rep_q6);

        // Question 7
        System.out.println("\nÀ partir d'une liste de mots, transformer chaque nom en une chaîne de la forme 'Nom Index' où l'index représente la position du nom dans la liste.");
        List<String> rep_q7 = liste.stream()
                .map(word -> word+" "+liste.indexOf(word))
                .collect(Collectors.toList());
        System.out.println(rep_q7);
    }
}