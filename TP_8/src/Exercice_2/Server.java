package Exercice_2;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static final int PORT = 1234;

    public static void main(String[] args) {
        new Server().start();
    }

    public void start() {
        try(
                ServerSocket serverSocket = new ServerSocket(PORT);
        ) {
            System.out.println("Server started on port " + PORT);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New Client connected");
                new ClientHandler(socket).start();
            }
        } catch (Exception e) {
            System.out.println("Couldn't start the server: "+ e.getMessage());
        }
    }
}
