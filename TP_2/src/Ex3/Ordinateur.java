package Ex3;

public class Ordinateur {
    private String nom, marque, description;
    private double prix;
    private int nbStock;
    private Categorie categorie;

    public Ordinateur(String nom, String marque, String description, double prix, int nbStock, Categorie categorie) {
        this.nom = nom;
        this.marque = marque;
        this.description = description;
        this.prix = prix;
        this.nbStock = nbStock;
        this.categorie = categorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getNbStock() {
        return nbStock;
    }

    public void setNbStock(int nbStock) {
        this.nbStock = nbStock;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public double getPrice(int qte){
        return this.getPrix() * qte;
    }

    @Override
    public String toString() {
        return "Ordinateur " +nom+": \n"+
                "   marque: " + marque+
                "   , description: " + description+
                "   , prix: " + prix + "DHs"+
                "   , available on stock: " + nbStock +
                "   , son catégorie: " + categorie.getNom()+"\n";
    }
}
