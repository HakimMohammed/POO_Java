# Computer Ordering System
### This repository is my answer to OOP Java quiz: Practical activity: Inheritance, Redefinition, Polymorphism, Abstract classes and interfaces.


## Table of Contents
- [Overview](#overview)
- [Classes](#classes)
    - [Ordinateur](#ordinateurs)
    - [Categorie](#categorie)
    - [LigneCommande](#lignecommande)
    - [Commande](#commande)
    - [Client](#client)
    - [Main](#main)
- [Output](#output)

## Overview

The Computer Ordering System is a Java application designed to manage the ordering of computers. It allows users to categorize computers, create orders, and manage client information. This system provides functionalities to add, remove, and search for computers by price.

## Classes

### Ordinateur

The `Ordinateur` class represents a computer with attributes and methods to manage its properties.

- **Attributes**:
    - `nom`: The name of the computer.
    - `marque`: The brand of the computer.
    - `description`: A description of the computer.
    - `prix`: The price of the computer.
    - `nbStock`: The quantity in stock.
    - `categorie`: The category to which the computer belongs.

- **Methods**:
    - Getters and setters for all attributes.
    - `getPrice(int qte)`: Calculates the total price for a given quantity.
    - `toString()`: Returns a string representation of the computer.

---

### Categorie

The `Categorie` class represents a category of computers, allowing you to manage a list of computers within that category.

- **Attributes**:
    - `nom`: The name of the category.
    - `description`: A description of the category.
    - `ordinateurs`: A list of computers in this category.

- **Methods**:
    - Getters and setters for all attributes.
    - `ajouterOrdinateur(Ordinateur nouveauOrdinateur)`: Adds a computer to the category.
    - `supprimerOrdinateur(Ordinateur ordinateur)`: Removes a computer from the category.
    - `rechercherParPrix(double prix)`: Searches for computers by price.
    - `toString()`: Returns a string representation of the category.

---

### LigneCommande

The `LigneCommande` class represents an individual line item in an order.

- **Attributes**:
    - `quantite`: The quantity of the ordered computer.
    - `commande`: The associated order.
    - `ordinateur`: The ordered computer.

- **Methods**:
    - Getters and setters for all attributes.
    - `toString()`: Returns a string representation of the line item.

---

### Commande

The `Commande` class represents an order placed by a client.

- **Attributes**:
    - `reference`: The order reference number.
    - `client`: The client who placed the order.
    - `date`: The date when the order was placed.
    - `etat`: The status of the order (e.g., completed or pending).

- **Methods**:
    - Getters and setters for all attributes.
    - `toString()`: Returns a string representation of the order.

---

### Client

The `Client` class represents a client who places orders.

- **Attributes**:
    - `nom`: The last name of the client.
    - `prenom`: The first name of the client.
    - `addresse`: The address of the client.
    - `email`: The email of the client.
    - `ville`: The city of the client.
    - `telephone`: The phone number of the client.
    - `commandesEffectués`: A list of orders placed by the client.

- **Methods**:
    - Getters and setters for all attributes.
    - `ajouterCommande(Commande commande)`: Adds a new order for the client.
    - `supprimerCommande(Commande commande)`: Removes an order from the client's list.
    - `toString()`: Returns a string representation of the client.

---

### Main

The `Main` class contains the `main` method, which serves as the entry point for the application. It demonstrates the creation of computers, categories, clients, orders, and order lines.

## Output

Commande numero aaa<br>
client: Jhon Doe, addresse: Casablanca, email: example@gmail.com, ville: Casablanca, telephone: 0611223344<br>
date: Tue Oct 31 00:00:00 GMT 2024<br>
etat: false<br>

LigneCommande du commande num aaa<br>
5 ordinateurs de<br>
Ordinateur ordinateur1:<br>
marque: acer, description: Laptop, prix: 15000.0DHs, available on stock: 10, son catégorie: work<br>

LigneCommande du commande num aaa<br>
10 ordinateurs de<br>
Ordinateur ordinateur2:<br>
marque: thinkpad, description: Laptop, prix: 7000.0DHs, available on stock: 20, son catégorie: work<br>

LigneCommande du commande num aaa<br>
1 ordinateurs de<br>
Ordinateur ordinateur3:<br>
marque: apple, description: MacBook M2, prix: 20000.0DHs, available on stock: 3, son catégorie: work<br>

