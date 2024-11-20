package Ex4;

import java.util.Arrays;
import java.util.List;

public class CharCalculator {

    public static void runCalculator(String input) {
        Character[] alphabets = new Character[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        List<Character> alphabetList = Arrays.asList(alphabets);
        int[] nb_occurences = new int[26];

        // make all characters in input lowercase
        String str = input.toLowerCase();
        // Remove Spaces
        str = str.replaceAll("\\s", "");

        // Count Occurences and Fill Table
        for(Character c : str.toCharArray()) {
            int index = alphabetList.indexOf(c);
            nb_occurences[index]++;
        }

        // Print Result
        System.out.println("La chaine "+input+" contient :");
        for(int i = 0; i < 26; i++) {
            if(nb_occurences[i] > 0) {
                System.out.println(nb_occurences[i] +" fois la lettre '"+alphabets[i]+"'");
            }
        }
    }
}

