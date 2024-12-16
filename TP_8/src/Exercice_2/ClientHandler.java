package Exercice_2;

import java.io.*;
import java.net.Socket;

public class ClientHandler extends Thread {
    private final Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try(
                InputStream inputStream = socket.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                OutputStream outputStream = socket.getOutputStream();
                PrintWriter printWriter = new PrintWriter(outputStream, true);
        ) {
            manageFiles(printWriter, bufferedReader);
        } catch (Exception e) {
            System.out.println("Error handling client: " + e.getMessage());
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                System.out.println("Couldn't close the socket: " + e.getMessage());
            }
        }
    }

    public void manageFiles(PrintWriter printWriter, BufferedReader bufferedReader) throws IOException {
        printWriter.println("-------------- FILE MANAGER SERVER -------------------");
        String path = "/home/ubuntu/Desktop/EN7/Java/TP_8/src/Exercice_2/mock_directory";
        File directory = new File(path);

        if( directory.exists() && directory.isDirectory()) {
            customLS(directory, printWriter);
        } else {
            System.out.println("Invalid directory");
        }

        printWriter.println("------------------------------------------------------");
        printWriter.println("Which file do you want to download?");
        String filename = bufferedReader.readLine();
        File file = new File(directory, filename);
        if (file.exists() && file.isFile()) {
            try (FileReader fileReader = new FileReader(file);
                 BufferedReader fileBufferedReader = new BufferedReader(fileReader)) {
                String line;
                while ((line = fileBufferedReader.readLine()) != null) {
                    printWriter.println(line);
                }
            }
        } else {
            printWriter.println("File not found");
        }
    }

    // Code from TP6
    private static void customLS(File directory, PrintWriter printWriter) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                printWriter.println(decorate(file));
                if (file.isDirectory()) {
                    customLS(file, printWriter);
                }
            }
        }
    }

    private static String decorate(File file) {
        return file.getName() +
                (file.isDirectory() ? "      <DIR>    " : "      <FILE>    ") +
                (file.canRead() ? "      r" : "      -") +
                (file.canWrite() ? "w" : "-") +
                (file.isHidden() ? "h" : "-");
    }
}
