# `Note Invalid Exception`'s Documentation

## Class `NoteInvalidException`

### Description
The Class `NoteInvalidException` is a customised Exception which calls `super()` and provides a customised Exception Message 

## Class `Evaluateur`

### Description
Class `Evaluateur` is used to evaluate grades by checking if they fall within a valid range (between 0 and 20 inclusive). If a grade is outside this range, our custom exception `NoteInvalidException` is thrown.
### Constructor 

##### `public Evaluateur()`
- **Description**: Default constructor for class `Evaluateur`. It does not initialize any specific attributes.

### Méthodes

#### public void `verifierNote(int note)` throws `NoteInvalidException`
- **Description**: Checks if the provided grade is valid.
- **Parameters**: int note: The grade to evaluate.
- **Exceptions**: NoteInvalidException: Thrown if the grade is less than 0 or greater than 20.

### public static void `main(String args[])`

- **Description**: Entry point of the application. It creates an instance of `Evaluateur`, evaluates two grades, and handles potential exceptions.
- **Behavior**:
        Evaluates the grade 15 and displays a success message.
        Attempts to evaluate the grade 25, which triggers a `NoteInvalidException`.
        Catches the exception and displays an error message.

### Execution Example

```java
public static void main(String args[]){
    try{
        Evaluateur e = new Evaluateur();

        System.out.println("Evaluer la note 15");
        e.verifierNote(15);
        System.out.println("Note évalué\n");

        System.out.println("Evaluer la note 25");
        e.verifierNote(25);
        System.out.println("Note évalué\n");
    } catch (NoteInvalidException e){
        System.out.println(e.getMessage());
    }
}