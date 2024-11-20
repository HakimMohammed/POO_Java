# Java Library Management System

### This repository is my answer to OOP Java quiz: Practical activity: Inheritance, Redefinition, Polymorphism, Abstract classes and interfaces.

## Table of Contents

- [Overview](#overview)
- [Classes Overview](#classes-overview)
    - [Personne](#personne)
    - [Auteur](#auteur)
    - [Adherent](#adherent)
    - [Livre](#livre)
    - [Main](#main)
- [Output](#output)

## Overview
This project implements a simple library management system in Java. It defines a hierarchy of classes to represent people associated with the library, including authors and members (adherents), as well as the books themselves.


## Classes Overview

### Personne

The `Personne` class represents a person with the following attributes:
- `nom` (String): The person's last name.
- `prenom` (String): The person's first name.
- `email` (String): The person's email address.
- `tel` (String): The person's phone number.
- `age` (int): The person's age.

#### Methods
- `afficher()`: Displays the person's details.

### Auteur
The `Auteur` class extends the `Personne` class and represents an author with an additional attribute:
- `numAuteur`: The unique identifier for the author.

#### Methods
- `afficher()`: Overrides the method from `Personne` to display the author's details along with the unique identifier.

### Adherent
The `Adherent` class also extends the `Personne` class and represents a library member with an additional attribute:
- `numAdherent`: The unique identifier for the member.

#### Methods
- `afficher()`: Overrides the method from `Personne` to display the member's details along with the unique identifier.

### Livre
The `Livre` class represents a book with the following attributes:
- `ISBN`: The unique identifier for the book.
- `auteur`: An instance of the `Auteur` class representing the book's author.
- `titre`: The title of the book.

#### Methods
- `afficher()`: Displays the book's details along with the author's information.

### Main
The `Main` class contains the `main` method, which serves as the entry point for the application. It creates instances of `Adherent`, `Auteur`, and `Livre`, and displays their details.

## Output
----- Adherent -----------<br>
Nom: Jhon<br>
Prénom: Doe<br>
Email: email@example.com<br>
Téléphone: 0611223344<br>
Âge: 35<br>
------------------------------<br>
---------- Livre -------------<br>
ISBN :10<br>
Titre :The Devils Rules<br>
---------- Auteur -------------<br>
Nom: Mustafa<br>
Prénom: Mahmoud<br>
Email: mustapha@mahmoud.com<br>
Téléphone: 0699887766<br>
Âge: 87<br>
Numéro d'auteur: 1<br>
------------------------------<br>
