# String Editor

## Description

The String Editor is a Java project designed to perform various operations on strings. This project allows the user to input a string and perform operations such as displaying the string, reversing the words in the string, and counting the number of words in the string.

## Installation

To run this project, ensure you have the following:

- Java Development Kit (JDK) installed on your machine.
- An Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or similar.

### Steps:

1. Clone the repository or download the source code.
2. Open the project in your preferred IDE.
3. Ensure that the JDK is correctly configured in your IDE.
4. Compile and run the `Main.java` file.

## Usage

Below is an example of how to use the functionalities provided by the String Editor:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = "";
        int choice;
        do {
            System.out.println("--------------------- String Editor ----------------------------- \n" +
                    "Select one of the following operations by typing its index: \n"+
                    "1 : Input String \n2 : Display String \n3 : Reverse Words \n4 : Count Words \n5 : Quit");

            // Check if the input is an integer
            while (!sc.hasNextInt()) {
                System.out.println("Please select an operation");
                sc.next();
            }
            choice = sc.nextInt();

            // Without this magical line, it will automatically jump to another option when choosing 1
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter a string:");
                    input = sc.nextLine();

                    // Wait for user's input
                    System.out.println("Press any key to return to the menu.");
                    sc.nextLine();
                    break;
                case 2:
                    if(input.isEmpty()) {
                        System.out.println("Please enter a string first");
                    } else {
                        System.out.println("Entered String:");
                        System.out.println(input);

                        // Wait for user's input
                        System.out.println("Press any key to return to the menu.");
                        sc.nextLine();
                    }
                    break;
                case 3:
                    if(input.isEmpty()) {
                        System.out.println("Please enter a string first");
                    } else {
                        String reversed = StringEditor.reverse(input);
                        System.out.println("Reversed String:");
                        System.out.println(reversed);

                        // Wait for user's input
                        System.out.println("Press any key to return to the menu.");
                        sc.nextLine();
                    }
                    break;
                case 4:
                    if(input.isEmpty()) {
                        System.out.println("Please enter a string first");
                    } else {
                        int nbWords = StringEditor.countWords(input);
                        System.out.println("Number of words: "+nbWords);

                        // Wait for user's input
                        System.out.println("Press any key to return to the menu.");
                        sc.nextLine();
                    }
                    break;
                case 5:
                    System.out.println("Exiting ...");
                    break;
            }
        } while(choice != 5);
        sc.close();
    }
}
```

### StringEditor Methods:

- `reverse(String str)`: Reverses the words in the given string.
- `countWords(String str)`: Counts the number of words in the given string. The space character (‘ ’) is considered as the word separator.

#### Example:

When the user selects option 1 to input the string "Hello World this is Java":

- Option 2 (Display String): Outputs "Hello World this is Java".
- Option 3 (Reverse Words): Outputs "[Java, is, this, World, Hello]".
- Option 4 (Count Words): Outputs "5".

## Contributors

- [Your Name]

Feel free to contribute to this project by submitting a pull request or opening an issue on the repository.