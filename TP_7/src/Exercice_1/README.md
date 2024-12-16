# Sommeur Class

## Overview

The `Sommeur` class is a Java class that implements the `Runnable` interface. It is designed to calculate the sum of a sublist of integers in a multi-threaded environment. This class is useful for dividing a large list of integers into smaller parts and summing them concurrently using multiple threads.

## Class Definition

```java
package Exercice_2;

import java.util.List;

public class Sommeur implements Runnable {

    private List<Integer> list;
    private int start;
    private int end;

    public Sommeur(List<Integer> nombres, int debut, int fin) {
        list = nombres;
        start = debut;
        end = fin;
    }

    public int getSomme() {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += list.get(i);
        }
        return sum;
    }

    @Override
    public void run() {
        // The run method is currently empty
    }
}
```

## How It Works

-   Constructor:The constructor takes three parameters:  
    -   nombres: The list of integers to be summed. 
    -   debut: The starting index of the sublist. 
    -   fin: The ending index of the sublist.
-   getSomme Method: This method calculates the sum of the integers in the sublist defined by the start and end indices.  
-   run Method: The run method is currently empty. In a typical use case, you might want to call the getSomme method within the run method to perform the sum calculation when the thread is executed.

## Example Usage
Here is an example of how to use the Sommeur class in a multi-threaded environment:
    
```java
package Exercice_2;

import java.util.List;

public class Main {
public static void main(String[] args) {
List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
Sommeur sommeur1 = new Sommeur(list, 0, 5);
Sommeur sommeur2 = new Sommeur(list, 5, 10);
Sommeur sommeur3 = new Sommeur(list, 10, 15);

        Thread thread1 = new Thread(sommeur1);
        Thread thread2 = new Thread(sommeur2);
        Thread thread3 = new Thread(sommeur3);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("La somme de la liste est: " + (sommeur1.getSomme() + sommeur2.getSomme() + sommeur3.getSomme()));
    }
}
```