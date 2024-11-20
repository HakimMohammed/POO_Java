package Ex2;

public class Manager extends Employe{
    private String service;

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service){
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    @Override
    public double calculerSalaire() {
        return getSalaire() + getSalaire()*0.2;
    }

    public void afficher() {
        System.out.println("------------ Manager -----------------");
        System.out.println("Nom: " + getNom());
        System.out.println("Prénom: " + getPrenom());
        System.out.println("Service: " + service);
        System.out.println("Salaire: " + calculerSalaire());
        System.out.println("-------------------------------------");
    }
}
