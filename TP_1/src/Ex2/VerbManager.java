package Ex2;

public class VerbManager {

    public static void conjuger(String verb) {
        if(!verb.endsWith("er")) {
            System.out.println("Verbe ne termine pas par 'er'");
            return;
        }

        System.out.println("Je "+verb.substring(0,verb.length()-1));
        System.out.println("Tu "+verb.substring(0,verb.length()-1)+"s");
        System.out.println("Il "+verb.substring(0,verb.length()-1));
        System.out.println("Nous "+verb.substring(0,verb.length()-2)+"ons");
        System.out.println("Vous "+verb.substring(0,verb.length()-2)+"ez");
        System.out.println("Ils "+verb.substring(0,verb.length()-1)+"nt");
    }
}
