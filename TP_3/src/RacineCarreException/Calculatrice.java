package RacineCarreException;

public class Calculatrice {
    public Calculatrice(){};

    public void testRacinceCarre(int number) throws RacineCarreException {
        if( number < 0 ){
            throw new RacineCarreException(number);
        }
    }

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
}
