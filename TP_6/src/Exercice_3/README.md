# Product Management Application

## Class Definitions

### **Application** Class

The **Application** class provides a command-line interface for interacting with the product management system. It allows users to perform the following operations:  

-   Display the list of products.
-   Search for a product by name.
- Add a new product.
- Delete a product by name.
- Save all products to a file.
- Exit the application.


### **MetierProduitImpl** Class

The **MetierProduitImpl** class implements the **IMetier** interface for managing products. It handles the storage and retrieval of products from a file.  

## Methods
- **add(Produit o)**: Adds a new product.
- **getAll()**: Retrieves and returns the list of all products.
- **findByNom(String nom)**: Finds and returns a product by its name.
- **delete(String nom)**: Deletes a product by its name.
- **saveAll()**: Saves all products to a file.

## How It Works

- **Application Method**:  
    -   Prompts the user to select an operation from the menu.
    -   Based on the user's choice, it calls the appropriate method in the **MetierProduitImpl** class to perform the operation.

- **MetierProduitImpl Methods**:  

    - **add**: Adds a new product to the list.
    - **getAll**: Reads and returns the list of products from the file. 
    - **findByNom**: Searches for a product by name in the list. 
    - **delete**: Removes a product by name from the list. 
    - **saveAll**: Writes the list of products to the file.

## Example Usage

To run the program, compile the **Application** class and execute the generated **Application.class** file.


## Directory Structure

```text
TP_6/
├── src/
│   └── Exercice_3/
│       ├── Application.java
│       ├── ApplicationClient.java
│       ├── metier/
│       │   ├── IMetier.java
│       │   ├── MetierClientImpl.java
│       │   └── MetierProduitImpl.java
│       ├── models/
│       │   ├── Client.java
│       │   └── Produit.java
│       └── repertoire/  # Directory where product and client files are stored
└── pom.xml  # Maven configuration file
```