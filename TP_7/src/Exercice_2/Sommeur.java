package Exercice_2;

import java.util.List;

public class Sommeur implements Runnable {

    private List<Integer> list;
    private int start;
    private int end;

    public Sommeur(List<Integer> nombres, int debut, int fin) {
        list = nombres;
        start = debut;
        end = fin;
    }

    public int getSomme() {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += list.get(i);
        }
        return sum;
    }

    @Override
    public void run() {

    }
}
