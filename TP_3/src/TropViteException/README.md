# `Trop Vitesse Exception`'s Documentation

## Class `TropVitesseException`

### Description
The Class `TropVitesseException` is a customised Exception which calls `super()` and provides a customised Exception Message.

## Class `Vehicule`

### Description
Class `Vehicule` is used to test a given speed. If the speed is higher than 90, our custom exception `TropVitesseException` is thrown.

### Constructor

##### `public Vehicule()`
- **Description**: Default constructor for class `Vehicule`. It does not initialize any specific attributes.

### Méthodes

#### public void `testVitesse(int speed)` throws `TropVitesseException`
- **Description**: Checks if the provided speed is higher than 90.
- **Parameters**: int speed: The provided speed.
- **Exceptions**: TropVitesseException: Thrown if the speed is higher than 90.

### public static void `main(String args[])`

- **Description**: Entry point of the application. It creates an instance of `Vehicule`, evaluates two speeds, and handles potential exceptions.
- **Behavior**:
  Evaluates the number 80 and displays a success message.
  Attempts to evaluate the number 150, which triggers a `TropVitesseException`.
  Catches the exception and displays an error message.

### Execution Example

```java
public static void main(String args[]){
    Vehicule vehicule = new Vehicule();
    try{
        System.out.println("Testing Speed when speed = 80");
        vehicule.testVitesse(80);
        System.out.println("Speed is safe \n");

        System.out.println("Testing Speed when speed = 150");
        vehicule.testVitesse(150);
        System.out.println("Speed is safe");
    } catch (TropViteException e){
        System.out.println(e.getMessage());
    }
}