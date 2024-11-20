# Employee Management System
### This repository is my answer to OOP Java quiz: Practical activity: Inheritance, Redefinition, Polymorphism, Abstract classes and interfaces.

## Table of Contents
- [Overview](#overview)
- [Classes](#classes)
    - [Employe (Abstract Class)](#employe-abstract-class)
    - [Ingénieur](#ingénieur)
    - [Manager](#manager)
    - [Main](#main)
- [Output](#output)

## Overview

The Employee Management System is a Java application designed to manage employees in an organization. It utilizes abstract classes and inheritance to define employee roles such as `Ingénieur` (Engineer) and `Manager`. The application calculates and displays salaries based on the defined rules for each role.

## Classes

### Employe (Abstract Class)
The `Employe` class serves as an abstract base class for all employees. It contains common attributes and methods for all employee types:
- **Attributes**:
    - `nom`: The last name of the employee.
    - `prenom`: The first name of the employee.
    - `email`: The email address of the employee.
    - `telephone`: The telephone number of the employee.
    - `salaire`: The base salary of the employee.

- **Methods**:
    - `calculerSalaire()`: An abstract method to be implemented by subclasses for calculating the salary.
    - Getters for all attributes.

### Ingénieur
The `Ingénieur` class extends `Employe` and represents an engineer with an additional attribute:
- **Attributes**:
    - `specialité`: The specialty of the engineer.

- **Methods**:
    - `calculerSalaire()`: Calculates the salary with a 15% increase.
    - `afficher()`: Displays the engineer's details.

### Manager
The `Manager` class extends `Employe` and represents a manager with an additional attribute:
- **Attributes**:
    - `service`: The department or service managed by the manager.

- **Methods**:
    - `calculerSalaire()`: Calculates the salary with a 20% increase.
    - `afficher()`: Displays the manager's details.

### Main
The `Main` class contains the `main` method, which is the entry point for the application. It creates instances of `Ingénieur` and `Manager`, and displays their details.

## Output
Upon running the application, you will see output displaying the details of the engineer and the manager, including their calculated salaries.

------------ Ingénieur -----------------<br>
Nom: Martin<br>
Prénom: Paul<br>
Specialité: Informatique<br>
Salaire: 5750.0<br>
-------------------------------------<br>

------------ Manager -----------------<br>
Nom: Durand<br>
Prénom: Sophie<br>
Service: Développement<br>
Salaire: 6000.0<br>
-------------------------------------<br>



