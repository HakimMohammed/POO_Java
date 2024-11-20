package Collections.Sets;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // Question 1
        HashSet<String> groupeA = new HashSet<>();
        HashSet<String> groupeB = new HashSet<>();

        // Question 2
        System.out.println("\nAjout des étudiants ...");
        groupeA.add("Mohamed");
        groupeA.add("Yasser");
        groupeA.add("Otmane");
        groupeB.add("Hakim");
        groupeB.add("Yasser");
        groupeB.add("Touhami");

        // Question 3
        System.out.println("\nIntersection");
        groupeA.forEach((student)->{
            if( groupeB.contains(student)){
                System.out.println(student+" est dans les deux groupes");
            }
        });

        // Question 4
        System.out.println("\nUnion");
        HashSet<String> union = new HashSet<>();
        groupeA.forEach((student) -> union.add(student));
        groupeB.forEach((student) -> union.add(student));
        System.out.println(union);
    }
}