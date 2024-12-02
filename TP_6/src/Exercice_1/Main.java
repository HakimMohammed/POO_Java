package Exercice_1;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Siaisr le chemin de répértoire");
        String path = scanner.nextLine();
        scanner.close();

        File directory = new File(path);

        // Let's check if the directory exists
        if( directory.exists() && directory.isDirectory()) {
            customLS(directory);
        } else {
            System.out.println("Répértoire invalide");
        }
    }

    public static void customLS(File directory) {
        System.out.println("-----------------------------------------------------");
        System.out.println("-------------------- CUSTOM LS ----------------------");
        System.out.println("-----------------------------------------------------");

        File[] files = directory.listFiles();
        assert files != null;
        for(File file: files) {
            decorate(file);
        }
    }

    public static void decorate(File file) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file.getAbsoluteFile());
        stringBuilder.append(file.isDirectory() ? "      <DIR>    " : "      <FILE>    " );
        stringBuilder.append(file.canRead() ? "      r" : "      -" );
        stringBuilder.append(file.canWrite() ? "w" : "-" );
        stringBuilder.append(file.isHidden() ? "h" : "-" );
        System.out.println(stringBuilder);
    }
}
