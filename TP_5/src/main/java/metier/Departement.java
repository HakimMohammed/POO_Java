package metier;

public class Departement {
    private int id;
    private String nom;

    public Departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Departement(String nom) {
        this.nom = nom;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
}

