# `Racine Carre Exception`'s Documentation

## Class `RacineCarreException`

### Description
The Class `RacineCarreException` is a customised Exception which calls `super()` and provides a customised Exception Message

## Class `Calculatrice`

### Description
Class `Calculatrice` is used to calculate the power of a given number by checking if the number is positive. If the given number is negative, our custom exception `RacineCarreException` is thrown.
### Constructor

##### `public Calculatrice()`
- **Description**: Default constructor for class `Calculatrice`. It does not initialize any specific attributes.

### Méthodes

#### public void `testRacineCarre(int number)` throws `RacineCarreException`
- **Description**: Checks if the provided number is positive.
- **Parameters**: int number: The number to calculate its square.
- **Exceptions**: RacineCarreException: Thrown if the number is negative.

### public static void `main(String args[])`

- **Description**: Entry point of the application. It creates an instance of `Calculatrice`, evaluates two numbers, and handles potential exceptions.
- **Behavior**:
  Evaluates the number 25 and displays a success message.
  Attempts to evaluate the number -5, which triggers a `RacineCarreException`.
  Catches the exception and displays an error message.

### Execution Example

```java
public static void main(String args[]){
    Calculatrice C = new Calculatrice();
    try{
        System.out.println("Can we get the square of the number 25 ?");
        C.testRacinceCarre(25);
        System.out.println("Yes we can\n");
        
        System.out.println("Can we get the square of the number -5 ?");
        C.testRacinceCarre(-5);
        System.out.println("Yes we can\n");
    } catch (RacineCarreException e) {
        System.out.println(e.getMessage());
    }
}