# Phone Directory Application

## Overview

This application is a simple phone directory manager that allows users to add, delete, update, and search for contacts. It consists of two main classes: `Main` and `DossierContact`.

## Class Definitions

### `Main` Class

The `Main` class provides a command-line interface for interacting with the phone directory. It allows users to perform the following operations:

- Search for a phone number by contact name.
- Add a new contact.
- Delete an existing contact.
- Update the phone number of an existing contact.
- Exit the application.

#### Methods

- `main(String[] args)`: The entry point of the application. It displays a menu and handles user input to perform the desired operations.

### `DossierContact` Class

The `DossierContact` class manages the contact directory stored in files. Each contact is stored in a separate file within a specified directory.

#### Methods

- `addContact(String name, String phone_number)`: Adds a new contact with the given name and phone number.
- `delContact(String name)`: Deletes the contact with the given name.
- `getContactByName(String name)`: Retrieves and prints the phone number of the contact with the given name.
- `updateContact(String name, String phone_number)`: Updates the phone number of the contact with the given name.

## How It Works

1. **Main Method**:
    - Prompts the user to select an operation from the menu.
    - Based on the user's choice, it calls the appropriate method in the `DossierContact` class to perform the operation.

2. **DossierContact Methods**:
    - `addContact`: Creates a new file with the contact's name and writes the phone number to the file.
    - `delContact`: Deletes the file corresponding to the contact's name.
    - `getContactByName`: Reads and prints the phone number from the file corresponding to the contact's name.
    - `updateContact`: Overwrites the phone number in the file corresponding to the contact's name.

## Example Usage

To run the program, compile the `Main` class and execute the generated `Main.class` file.

```bash
javac Exercice_2/Main.java
java Exercice_2.Main
```

## Directory Structure
```text
TP_6/
├── src/
│   └── Exercice_2/
│       ├── DossierContact.java
│       ├── Main.java
│       └── repertoire/  # Directory where contact files are stored
└── pom.xml  # Maven configuration file
```
