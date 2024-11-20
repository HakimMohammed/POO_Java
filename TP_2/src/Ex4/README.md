# Product Management System
### This repository is my answer to OOP Java quiz: Practical activity: Inheritance, Redefinition, Polymorphism, Abstract classes and interfaces.

## Table of Contents
- [Overview](#overview)
- [Classes](#classes)
    - [Produit](#produit)
    - [IMetierProduit](#imetierproduit)
    - [MetierProduitImpl](#metierproduitimpl)
    - [Application](#application)
- [Output](#output)

## Overview

The Product Management System is a Java application designed to manage products in a simple inventory system. It allows users to add, delete, search, and view products through a console-based interface.

## Classes

### Produit

The `Produit` class represents a product with essential attributes and methods to manage its details.

- **Attributes**:
    - `id`: A unique identifier for the product (of type `long`).
    - `nbStock`: The number of items in stock (of type `int`).
    - `nom`: The name of the product (of type `String`).
    - `marque`: The brand of the product (of type `String`).
    - `description`: A description of the product (of type `String`).
    - `prix`: The price of the product (of type `double`).

- **Methods**:
    - Getters for `nom` and `id`.
    - `toString()`: Returns a string representation of the product.

---

### IMetierProduit

The `IMetierProduit` interface defines the operations that can be performed on products.

- **Methods**:
    - `addProduit(Produit p)`: Adds a new product.
    - `getAll()`: Retrieves a list of all products.
    - `findByNom(String motCle)`: Searches for products by name keyword.
    - `findById(long id)`: Finds a product by its ID.
    - `delete(long id)`: Deletes a product by its ID.

---

### MetierProduitImpl

The `MetierProduitImpl` class implements the `IMetierProduit` interface, providing the functionality for managing products.

- **Attributes**:
    - `produits`: A list of `Produit` objects to store the products.

- **Methods**:
    - `addProduit(Produit p)`: Adds the product to the list and returns it.
    - `getAll()`: Returns the list of all products.
    - `findByNom(String motCle)`: Filters products by name keyword and returns matching products.
    - `findById(long id)`: Returns the product with the specified ID, or `null` if not found.
    - `delete(long id)`: Removes the product with the specified ID from the list.

---

### Application

The `Application` class contains the `main` method, which serves as the entry point for the application. It provides a console menu for users to interact with the product management system.

- **Methods**:
    - The main method presents a menu to the user, allowing them to:
        - Display all products.
        - Search for products by name.
        - Add a new product.
        - Retrieve a product by ID.
        - Delete a product by ID.
        - Exit the application.

## Output

--------------------- Produit Metier -----------------------------<br>
Séléctionner une des opérations suivantes par taper son index :<br>
1 : Afficher la liste des produits<br>
2 : Rechercher des produits par un mot clé<br>
3 : Ajouter un nouveau produit dans la liste.<br>
4 : Récupérer et afficher un produit par ID.<br>
5 : Supprimer un produit par id.<br>
6 : Quitter<br>
