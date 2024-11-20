package RacineCarreException;

public class RacineCarreException extends Exception {
    public RacineCarreException(int number) {
        super("C'est une exception de type RacineCarreeException. Nombre négatif : "+number);
    }
}
