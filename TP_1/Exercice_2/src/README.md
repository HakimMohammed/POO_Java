# French Verb Conjugator

## Description

The French Verb Conjugator is a Java project designed to help users conjugate French verbs ending in "er". The project allows users to input a verb, and it outputs the conjugation for different pronouns.

## Installation

To run this project, make sure you have the following:

- Java Development Kit (JDK) installed on your machine.
- An Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or similar.

### Steps:

1. Clone the repository or download the source code.
2. Open the project in your preferred IDE.
3. Ensure that the JDK is correctly configured in your IDE.
4. Compile and run the `Main.java` file.

## Usage

Below is an example of how to use the functionalities provided by the French Verb Conjugator:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a verb: ");
        String verb = sc.nextLine();
        VerbManager.conjuger(verb);
    }
}
```

### VerbManager Methods:

- `conjuger(String verb)`: Conjugates the given verb if it ends with "er". It outputs the conjugation for the pronouns: Je, Tu, Il, Nous, Vous, Ils.

#### Example:

When the user inputs the verb "parler":

```plaintext
Je parle
Tu parles
Il parle
Nous parlons
Vous parlez
Ils parlent
```

## Contributors

- [Your Name]

Feel free to contribute to this project by submitting a pull request or opening an issue on the repository.