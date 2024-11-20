package Streams.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employé> employees = new ArrayList<>();

        // Insertion
        employees.add(new Employé("Alice", "Informatique", 50000));
        employees.add(new Employé("Bob", "Ressources Humaines", 45000));
        employees.add(new Employé("Charlie", "Marketing", 55000));
        employees.add(new Employé("David", "Finance", 60000));
        employees.add(new Employé("Eve", "Ventes", 48000));

        // Question 1
        System.out.println("\nUtiliser mapToDouble et sum pour calculer la somme totale des salaires de tous les employés.");
        double somme_saliaire = employees.stream()
                .mapToDouble(e -> e.getSalaire())
                .sum();
        System.out.println(somme_saliaire);

        // Question 2
        System.out.println("\nUtiliser sorted pour trier la liste des employés par ordre alphabétique du nom.");
        List employees_sorted_by_name = employees.stream()
                .map(e -> e.getNom())
                .sorted().toList();
        System.out.println(employees_sorted_by_name);

        // Question 3
        System.out.println("\nUtiliser min pour trouver l'employé avec le salaire le plus bas.");
        double min_saliaire = employees.stream()
                .mapToDouble(e -> e.getSalaire())
                .min()
                .orElse(0.00);
        System.out.println(min_saliaire);

        // Question 4
        System.out.println("\nUtiliser filter pour obtenir la liste des employés ayant un salaire supérieur à une valeur donnée.");
        double salaire = 50000;
        List<Employé> liste = employees.stream()
                .filter(e -> e.getSalaire() > salaire)
                .toList();
        System.out.println(liste);

        // Question 5
        System.out.println("\nUtilisez reduce pour trouver l'employé avec le salaire le plus élevé dans l'ensemble de l'entreprise.");
        Optional<Employé> employé = employees.stream()
                .reduce((emp1, emp2) -> emp1.getSalaire() > emp2.getSalaire() ? emp1 : emp2);
        employé.ifPresent(System.out::println);

        // Question 6
        System.out.println("\nUtilisez reduce pour concaténer les noms de tous les employés");
        String nom_concatene = employees.stream()
                .map(e -> e.getNom())
                .reduce("",(emp1, emp2) -> emp1+emp2)  ;
        System.out.println(nom_concatene);
    }
}