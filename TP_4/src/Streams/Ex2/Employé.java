package Streams.Ex2;

public class Employé {
    private String nom, departement;
    private double salaire;

    public Employé(String nom, String departement, double salaire) {
        this.nom = nom;
        this.departement = departement;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public String getDepartement() {
        return departement;
    }

    public double getSalaire() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Employé{" +
                "nom='" + nom + '\'' +
                ", departement='" + departement + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
