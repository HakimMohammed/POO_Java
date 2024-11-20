package Ex2;

public class Main {
    public static void main(String[] args) {
        Ingénieur ingénieur = new Ingénieur("Martin", "Paul", "paul.martin@email.com", "0123456789", 5000, "Informatique");
        Manager manager = new Manager("Durand", "Sophie", "sophie.durand@email.com", "0987654321", 5000, "Développement");

        ingénieur.afficher();
        manager.afficher();
    }
}