# `Collections.Maps`'s Documentation

## Class `Main`

### Description
The `Main` class demonstrates operations on a `HashMap` to manage student grades. It includes adding, modifying, removing, and analyzing entries in the map.

### Methods

#### `public static void main(String[] args)`
- **Description**: Entry point for the application. Demonstrates the following functionalities:
    1. **Inserting grades** into a `HashMap`.
    2. **Displaying grades** after insertion, modification, and deletion.
    3. **Finding the size** of the `HashMap`.
    4. **Finding the minimum and maximum grades**.
    5. **Checking for specific grades**, such as grades equal to 20.
- **Behavior**:
    - Inserts grades for three students (`Etud A`, `Etud B`, `Etud C`).
    - Updates the grade for `Etud C`.
    - Removes the entry for `Etud B`.
    - Computes and displays the maximum and minimum grades.
    - Verifies if any student has a grade equal to 20.

---

## Execution Example

### Inserting Grades
```text
Affichage après insertion
Etud A: 20.0
Etud B: 15.5
Etud C: 10.75
```

### Updating a Grade
```text
Affichage après augmentation
Etud A: 20.0
Etud B: 15.5
Etud C: 13.0
```

### Removing an Entry
```text
Affichage après suppression
Etud A: 20.0
Etud C: 13.0
```

### Finding the Size of the HashMap
```text
Affichage du taille
2
```

### Finding Minimum and Maximum Grades
```text
Affichage du note min et max
Maximum: 20.0
Minimum: 13.0
```

### Checking for Grades Equal to 20
```text
Verifier si une note égale à 20
Etud A a 20 comme note
```