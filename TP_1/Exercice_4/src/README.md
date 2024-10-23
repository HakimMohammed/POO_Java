# Character Occurrence Calculator

## Description

The Character Occurrence Calculator is a Java project designed to analyze a given text string and count the occurrences of each alphabet letter within the string. This project provides a clear breakdown of how many times each letter appears, ignoring case and spaces.

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

Here's an example of how to use the functionalities provided by the Character Occurrence Calculator:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String ch = sc.nextLine();

        CharCalculator.runCalculator(ch);
    }
}
```

### CharCalculator Methods:

- `runCalculator(String input)`: Takes an input string, converts it to lowercase, removes spaces, and counts the occurrences of each alphabet letter. The results are printed to the console.

#### Example:

When the user inputs the text "Hello World":

```plaintext
La chaine Hello World contient :
1 fois la lettre 'd'
3 fois la lettre 'l'
1 fois la lettre 'e'
1 fois la lettre 'r'
1 fois la lettre 'o'
1 fois la lettre 'w'
1 fois la lettre 'h'
```

## Contributors

- [Your Name]

Feel free to contribute to this project by submitting a pull request or opening an issue on the repository.