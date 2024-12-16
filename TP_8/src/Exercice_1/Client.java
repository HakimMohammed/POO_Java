package Exercice_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1337);
            System.out.println("Connected to server");

            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Guess the number between 0 and 100");
                int guess = scanner.nextInt();

                outputStream.write(guess);
                int response = inputStream.read();

                if( response == 0) {
                    System.out.println("Congratulations, you guessed the number!");
                    break;
                } else if (response == 1) {
                    System.out.println("Go Higher !");
                } else {
                    System.out.println("Go Lower !");
                }
            }

            System.out.println("Player is quiting ...");
            scanner.close();
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
