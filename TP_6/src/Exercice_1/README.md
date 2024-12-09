# File Manager

## Overview

The `Main` class is a Java program that performs a custom directory listing. It prompts the user to enter a directory path and then lists all files and directories within the specified directory, including their details such as type and permissions.

## Class Definition

```java
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
        File[] files = directory.listFiles();
        assert files != null;
        for(File file: files) {
            decorate(file);
            if ( file.isDirectory()) {
                customLS(file);
            }
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
```

## How it works

-   **Main Method**:
    -   The `main` method prompts the user to enter a directory path.
    -   It then creates a `File` object from the specified path.
    -   If the directory exists, it calls the `customLS` method to list the contents of the directory.
    -   If the directory does not exist, it prints an error message.
-   **CustomLS Method**:
    -   The `customLS` method lists all files and directories within the specified directory.
    -   It calls the `decorate` method to print the details of each file or directory.
    -   If a directory is encountered, it recursively calls itself to list the contents of the subdirectory.
-   **Decorate Method**:
    -   The `decorate` method prints the details of a file or directory.
    -   It prints the absolute path, type (file or directory), and permissions (read, write, hidden).

## Example Usage

To run the program, compile the `Main` class and execute the generated `Main.class` file.

```bash
javac Exercice_1/Main.java
java Exercice_1.Main
```
