# `Streams.Ex1`'s Documentation

## Class `Main`

### Description
The `Main` class demonstrates various operations on a list of strings using Java Streams. It covers filtering, mapping, flattening, and transforming data.

### Methods

#### `public static void main(String[] args)`
- **Description**: Entry point for the application. Demonstrates the following functionalities:
    1. Filtering strings containing a specific character.
    2. Filtering and reversing strings based on length.
    3. Flattening strings into a list of characters.
    4. Transforming strings to uppercase.
    5. Converting strings to their lengths.
    6. Flattening a list of character arrays into a single list.
    7. Creating indexed string representations.
- **Behavior**:
    - Operates on a fixed list of strings: `["Java", "Stream", "Example", "String"]`.
    - Uses stream operations to achieve the desired results.

---

## Execution Example

### Question 1: Filter Strings Containing "a"
```text
Filtrer les mots qui contient la lettre a
[Java, Stream]
```

### Question 2: Filter Strings Longer Than 3 and Reverse Them
```text
Filtrer les mots qui ont une longueur supérieure à 3 et transformer chaque mot en son inverse.
[avaJ, maertS, elpmaxE, gnirtS]
```

### Question 3: Flatten Strings Containing "e" into Character Lists
```text
Filtrer les chaînes qui contiennent la lettre "e" et aplatir chaque chaîne en une liste de ses caractères.
[[E, x, a, m, p, l, e], [S, t, r, e, a, m]]
```

### Question 4: Convert Strings to Uppercase
```text
Transformer chaque chaîne en sa version en majuscules.
[JAVA, STREAM, EXAMPLE, STRING]
```

### Question 5: Convert Strings to Their Lengths
```text
Convertir chaque chaîne en sa longueur.
[4, 6, 7, 6]
```

### Question 6: Flatten All Strings into a Single List of Characters
```text
Transformer chaque chaîne en une liste de ses caractères, puis aplatir toutes les listes en une seule liste de caractères.
[J, a, v, a, S, t, r, e, a, m, E, x, a, m, p, l, e, S, t, r, i, n, g]
```

### Question 7: Create Indexed String Representations
```text
À partir d'une liste de mots, transformer chaque nom en une chaîne de la forme 'Nom Index' où l'index représente la position du nom dans la liste.
[Java 0, Stream 1, Example 2, String 3]
```