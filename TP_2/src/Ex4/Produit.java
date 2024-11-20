package Ex4;

public class Produit {
    private long id;
    private int nbStock;
    private String nom, marque, description;
    private double prix;

    public Produit(int id, int nbStock, String nom, String marque, String description, double prix) {
        this.id = id;
        this.nbStock = nbStock;
        this.nom = nom;
        this.marque = marque;
        this.description = description;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nbStock=" + nbStock +
                ", nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                '}';
    }
}
