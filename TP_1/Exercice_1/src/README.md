# Student Grade Manager

## Description

The Student Grade Manager is a Java project designed to aid in managing and analyzing student grades. The project provides functionalities to sort grades, calculate the average grade, find the highest and lowest grades, and count the occurrences of a specific grade.

## Usage

Below is an example of how to use the functionalities provided by the Student Grade Manager:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int nbEtudiants = sc.nextInt();
        int[] notes = new int[nbEtudiants];

        for (int i = 0; i < nbEtudiants; i++) {
            System.out.println("Enter the grade for student number: "+(i+1));
            notes[i] = sc.nextInt();
        }

        // Sort grades
        NoteManager.sortGrades(notes);
        System.out.println("Sorted grades: " + Arrays.toString(notes));

        // Calculate average grade
        int average = NoteManager.getAverageGrade(notes);
        System.out.println("Average grade: "+average);

        // Get highest and lowest grades
        System.out.println(NoteManager.getHighLowGrade(notes));

        // Count occurrences of a specific grade
        System.out.println("Enter the grade you want to search for: ");
        int note = sc.nextInt();
        int nbOccurrences = NoteManager.getGradeOccurence(notes, note);
        System.out.println(nbOccurrences + " students have the grade " + note);
    }
}
```

### Key Methods in NoteManager:

- `sortGrades(int[] grades)`: Sorts the given array of grades in ascending order.
- `getAverageGrade(int[] grades)`: Calculates and returns the average grade.
- `getHighLowGrade(int[] grades)`: Returns a string with the lowest and highest grades.
- `getGradeOccurence(int[] grades, int grade)`: Returns the number of occurrences of the specified grade.