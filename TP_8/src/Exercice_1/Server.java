package Exercice_1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1337);
            System.out.println("Server is running on port 1337");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();


            int randomNumber = (int) (Math.random() * 100);

            while (true) {
                int guess = inputStream.read();
                System.out.println("Player guessed: " + guess);

                if (guess == randomNumber) {
                    outputStream.write(0);
                    System.out.println("Congratulations, you guessed the number!");
                    break;
                } else if (guess < randomNumber) {
                    outputStream.write(1);
                    System.out.println("Go Higher !");
                } else {
                    outputStream.write(-1);
                    System.out.println("Go Lower !");
                }
            }

            System.out.println("Server is closing ...");
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
