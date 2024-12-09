package Exercice_1;

public class Talkative implements Runnable{

    private static int parameter;

    public Talkative(int nombre) {
        parameter = nombre;
    }

    public int getParameter() {
        return parameter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getParameter());
        }
    }

    public static void main(String[] args) {
        // thread 1 to 10
        Thread thread1 = new Thread(new Talkative(1));
        Thread thread2  = new Thread(new Talkative(2));
        Thread thread3  = new Thread(new Talkative(3));
        Thread thread4  = new Thread(new Talkative(4));
        Thread thread5  = new Thread(new Talkative(5));
        Thread thread6  = new Thread(new Talkative(6));
        Thread thread7  = new Thread(new Talkative(7));
        Thread thread8  = new Thread(new Talkative(8));
        Thread thread9  = new Thread(new Talkative(9));
        Thread thread10  = new Thread(new Talkative(10));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
    }
}
