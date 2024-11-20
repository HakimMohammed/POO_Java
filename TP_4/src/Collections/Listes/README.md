# `Collections.Listes`'s Documentation

## Class `Produit`

### Description
The `Produit` class represents a product with attributes for ID, name, and price.

### Attributes
- **`private long id`**: The unique identifier for the product.
- **`private String nom`**: The name of the product.
- **`private double prix`**: The price of the product.

### Constructor

#### `public Produit(long id, String nom, double prix)`
- **Description**: Initializes a `Produit` object with the specified ID, name, and price.
- **Parameters**:
    - `long id`: The unique identifier for the product.
    - `String nom`: The name of the product.
    - `double prix`: The price of the product.

### Methods

#### `public String getNom()`
- **Description**: Retrieves the name of the product.
- **Returns**: The product's name (`String`).

#### `public String toString()`
- **Description**: Returns a string representation of the product, including its ID, name, and price.

---

## Class `GestionProduitsApp`

### Description
The `GestionProduitsApp` class manages a list of `Produit` objects. It demonstrates adding, removing, modifying, and searching for products in a list.

### Methods

#### `public static void main(String[] args)`
- **Description**: Entry point for the application. Demonstrates the following functionalities:
    1. **Adding products** to an `ArrayList`.
    2. **Displaying products** after addition.
    3. **Removing a product** from the list and displaying the updated list.
    4. **Modifying a product** in the list and displaying the updated list.
    5. **Searching for a product** by name and displaying matching results.
- **Behavior**:
    - Adds three products to the list.
    - Removes the product at index 2.
    - Modifies the first product in the list.
    - Prompts the user to enter a product name for searching.

---

## Class `Main`

### Description
The `Main` class serves as an entry point for testing purposes. It prints a simple message to indicate that this is Exercise 1 of "TP A."

### Methods

#### `public static void main(String[] args)`
- **Description**: Prints a message: `"This is Exercise 1 of TP A!"`.

---

## Execution Example

### Adding Products
```text
Affichage après ajout des produits
Produit{id=10, nom='Produit 1', prix=1000.0}
Produit{id=20, nom='Produit 2', prix=2000.0}
Produit{id=30, nom='Produit 3', prix=3000.0}
```

### Removing a Product
```text
Affichage après suppression
Produit{id=10, nom='Produit 1', prix=1000.0}
Produit{id=20, nom='Produit 2', prix=2000.0}
```

### Modifying a Product
```text
Affichage après modification
Produit{id=10, nom='Produit A', prix=1500.0}
Produit{id=20, nom='Produit 2', prix=2000.0}
```

### Searching for a Product
```text
Saisir le nom du produit que vous voulez
Produit 2
Produit{id=20, nom='Produit 2', prix=2000.0}
```