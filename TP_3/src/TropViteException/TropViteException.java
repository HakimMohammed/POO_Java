package TropViteException;

public class TropViteException extends Exception{
    public TropViteException(int number) {
        super("C'est une exception de type TropViteException. Vitesse en cause : "+number);
    }
}
