package Ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le nombre des étudiants :");
        int nbEtudiants = sc.nextInt();
        int[] notes = new int[nbEtudiants];

        for (int i = 0; i < nbEtudiants; i++) {
            System.out.println("Saisir la note d'étudiant num: "+(i+1));
            notes[i] = sc.nextInt();
        }

        // Sort
        NoteManager.sortGrades(notes);
        System.out.println(Arrays.toString(notes));

        // Average
        int average = NoteManager.getAverageGrade(notes);
        System.out.println("La note moyenne : "+average);

        // Low _ High
        System.out.println(NoteManager.getHighLowGrade(notes));

        // Occurences
        System.out.println("Saisir la note que vouz voulez rechercher : ");
        int note = sc.nextInt();
        int nbOccurrences = NoteManager.getGradeOccurence(notes, note);
        System.out.println(nbOccurrences+" étudiants ont la note "+note);
    }
}