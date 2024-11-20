package Collections.Maps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> notes = new HashMap<String, Double>();

        // Insértion des notes
        notes.put("Etud A",20.00);
        notes.put("Etud B",15.5);
        notes.put("Etud C",10.75);
        // Affichage
        System.out.println("\nAffichage après insertion");
        notes.forEach((k,v) -> System.out.println(k+": "+v));

        // Augmenter la note
        notes.put("Etud C", 13.00);
        // Affichage
        System.out.println("\nAffichage après augmentation");
        notes.forEach((k,v) -> System.out.println(k+": "+v));

        // Supprimer
        notes.remove("Etud B");
        // Affichage
        System.out.println("\nAffichage après suppression");
        notes.forEach((k,v) -> System.out.println(k+": "+v));

        // Taille
        System.out.println("\nAffichage du taille");
        System.out.println(notes.size());

        // Min Max
        double min = notes.entrySet().iterator().next().getValue();
        double max = min;
        System.out.println("\nAffichage du note min et max");
        for (double note: notes.values()) {
            min = (note < min) ? note : min;
            max = (note > max) ? note : max;
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);

        // Note égale à 20
        System.out.println("\nVerifier si une note égale à 20");
        notes.forEach((k,v) -> {
            if(v == 20.00){
                System.out.println(k+" a 20 comme note");
            }
        });
    }
}