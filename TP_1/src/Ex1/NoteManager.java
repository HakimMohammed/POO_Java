package Ex1;

import java.util.Arrays;

public class NoteManager {

    //  1. Sort and Show Grade List
    public static void sortGrades(int[] grades) {
        Arrays.sort(grades);
    }

    //  2. Get the average grade
    public static int getAverageGrade(int[] grades) {
        return Arrays.stream(grades).sum() / grades.length;
    }

    //  3. Get the highest and lowest grade
    public static String getHighLowGrade(int[] grades) {
        int low = Arrays.stream(grades).min().getAsInt();
        int high = Arrays.stream(grades).max().getAsInt();
        return "lowest Grade: " + low + " highest Grade: " + high;
    }

    //  4. Get the number of student that got a grade given by the user
    public static int getGradeOccurence(int[] grades, int grade) {
        int nbOccurrences = 0;
        for( int g:grades) {
            if(g == grade) {nbOccurrences++;}
        }
        return nbOccurrences;
    }
}
