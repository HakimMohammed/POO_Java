package Ex3;

import java.util.Arrays;

public class StringEditor {

    //  3. inverser : inverser la chaîne saisie.
    public static String reverse(String str) {
        String[] clean_str = str.split(" ");
        String[] reversed_str = new String[clean_str.length];

        for (int i = 0; i < clean_str.length; i++) {
            reversed_str[i] = clean_str[clean_str.length - (i +1)];
        }

        return Arrays.toString(reversed_str);
    }

    /*  4. Nombre de mots : compter le nombre de mots de la chaîne. On considère le
    caractère ‘ ’ (blanc) comme le caractère séparateur de mots. Il peut y avoir
    plusieurs blancs consécutifs dans la chaîne */
    public static int countWords(String str) {
        return str.split(" ").length;
    }
}
