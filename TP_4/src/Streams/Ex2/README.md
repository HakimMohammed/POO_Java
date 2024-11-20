# `Streams.Ex2`'s Documentation

## Class `Employé`

### Description
The `Employé` class represents an employee with attributes for name, department, and salary.

### Constructor

#### `public Employé(String nom, String departement, double salaire)`
- **Description**: Initializes an `Employé` instance with the specified name, department, and salary.
- **Parameters**:
    - `nom`: Name of the employee.
    - `departement`: Department of the employee.
    - `salaire`: Salary of the employee.

### Methods

#### `public String getNom()`
- **Description**: Returns the name of the employee.

#### `public String getDepartement()`
- **Description**: Returns the department of the employee.

#### `public double getSalaire()`
- **Description**: Returns the salary of the employee.

#### `public String toString()`
- **Description**: Returns a string representation of the `Employé` object.

---

## Class `Main`

### Description
The `Main` class demonstrates various stream operations on a list of employees, such as calculating totals, filtering, sorting, and reducing.

### Methods

#### `public static void main(String[] args)`
- **Description**: Entry point for the application. Demonstrates the following functionalities:
    1. Calculates the total sum of all employees' salaries.
    2. Sorts employees by name in alphabetical order.
    3. Finds the employee with the lowest salary.
    4. Filters employees with salaries above a given threshold.
    5. Finds the employee with the highest salary using `reduce`.
    6. Concatenates the names of all employees using `reduce`.

---

## Execution Example

### Question 1: Calculate Total Salaries
```text
Utiliser mapToDouble et sum pour calculer la somme totale des salaires de tous les employés.
258000.0
```

### Question 2: Sort Employees by Name
```text
Utiliser sorted pour trier la liste des employés par ordre alphabétique du nom.
[Alice, Bob, Charlie, David, Eve]
```

### Question 3: Find Employee with Lowest Salary
```text
Utiliser min pour trouver l'employé avec le salaire le plus bas.
45000.0
```

### Question 4: Filter Employees with Salaries Above a Threshold
```text
Utiliser filter pour obtenir la liste des employés ayant un salaire supérieur à une valeur donnée.
[Employé{nom='Charlie', departement='Marketing', salaire=55000.0}, Employé{nom='David', departement='Finance', salaire=60000.0}]
```

### Question 5: Find Employee with Highest Salary Using reduce
```text
Utilisez reduce pour trouver l'employé avec le salaire le plus élevé dans l'ensemble de l'entreprise.
Employé{nom='David', departement='Finance', salaire=60000.0}
```

### Question 6: Concatenate All Employee Names
```text
Utilisez reduce pour concaténer les noms de tous les employés
AliceBobCharlieDavidEve
```