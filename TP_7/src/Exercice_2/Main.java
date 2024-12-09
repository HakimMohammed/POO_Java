package Exercice_2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Sommeur sommeur1 = new Sommeur(list, 0, 5);
        Sommeur sommeur2 = new Sommeur(list, 5, 10);
        Sommeur sommeur3 = new Sommeur(list, 10, 15);

        Thread thread1 = new Thread(sommeur1);
        Thread thread2 = new Thread(sommeur2);
        Thread thread3 = new Thread(sommeur3);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("La somme de la liste est: " + (sommeur1.getSomme() + sommeur2.getSomme() + sommeur3.getSomme()));
    }
}
