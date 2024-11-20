# Exercise 2: Verb Conjugation

## Objective
This program reads a first-group verb (ending in "er") from the user and conjugates it in the present tense.

## Files
- `Application.java`: Handles user input and executes the program.
- `VerbManager.java`: Implements the conjugation logic.

## Functionalities
- **Verb Input**: The program reads a verb from the user using `Scanner`.
- **Conjugation Logic**: The `conjuger()` function in `VerbManager.java` verifies that the verb ends in "er" using `endsWith()`. It then conjugates the verb by removing the last two characters and adding the correct endings for each pronoun.

## Usage
1. Run `Application.java`.
2. Input a regular first-group verb (ending in "er").
3. The program will output the conjugated verb for each pronoun.
