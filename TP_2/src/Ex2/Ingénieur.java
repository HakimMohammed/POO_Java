package Ex2;

public class Ingénieur extends Employe{

    private String specialité;

    public Ingénieur(String nom, String prenom, String email, String telephone, double salaire, String specialité){
        super(nom, prenom, email, telephone, salaire);
        this.specialité = specialité;
    }

    @Override
    public double calculerSalaire() {
        return getSalaire() + (getSalaire() * 0.15);
    }

    public void afficher() {
        System.out.println("------------ Ingénieur -----------------");
        System.out.println("Nom: " + getNom());
        System.out.println("Prénom: " + getPrenom());
        System.out.println("Specialité: " + specialité);
        System.out.println("Salaire: " + calculerSalaire());
        System.out.println("-------------------------------------");
    }
}
