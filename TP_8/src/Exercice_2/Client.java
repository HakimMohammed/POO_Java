package Exercice_2;

import java.io.*;
import java.net.Socket;

public class Client {
    private static final int PORT = 1234;
    private static final String HOST = "localhost";

    public static void main(String[] args) {
        new Client().connect();
    }

    public void connect() {
        try(
                Socket socket = new Socket(HOST, PORT);
                InputStream inputStream = socket.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                OutputStream outputStream = socket.getOutputStream();
                PrintWriter printWriter = new PrintWriter(outputStream, true);
                BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))
        ) {
            System.out.println("Client connected to server on port " + PORT);
            interact(bufferedReader, consoleReader, printWriter);
        } catch (Exception e) {
            System.out.println("Couldn't connect to the server *-*");
        }
    }

    public void interact(BufferedReader bufferedReader, BufferedReader consoleReader, PrintWriter printWriter) throws Exception{
        while ( true ) {
            String line = bufferedReader.readLine();
            if (line == null || line.contains("Which file")) {
                break;
            }
            System.out.println(line);
        }

        System.out.print("Enter the filename to download: ");
        String filename = consoleReader.readLine();
        printWriter.println(filename);

        while ( true ) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
    }

}
