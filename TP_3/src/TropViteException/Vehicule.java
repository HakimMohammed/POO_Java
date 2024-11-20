package TropViteException;

public class Vehicule {
    public Vehicule(){};

    public void testVitesse(int speed) throws TropViteException {
        if(speed > 90){
            throw new TropViteException(speed);
        }
    }

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
}
