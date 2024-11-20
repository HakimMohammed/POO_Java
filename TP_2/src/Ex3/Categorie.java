package Ex3;

import java.util.ArrayList;

public class Categorie {
    private String nom, description;
    private ArrayList<Ordinateur>  ordinateurs;

    public Categorie(String nom, String description, ArrayList<Ordinateur> ordinateurs) {
        this.nom = nom;
        this.description = description;
        this.ordinateurs = ordinateurs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Ordinateur> getOrdinateurs() {
        return ordinateurs;
    }

    public void setOrdinateurs(ArrayList<Ordinateur> ordinateurs) {
        this.ordinateurs = ordinateurs;
    }

    public void ajouterOrdinateur(Ordinateur nouveauOrdinateur){
        if( ordinateurs.contains(nouveauOrdinateur)) {
            System.out.println("Ordinateur déjà dans la liste");
        }else{
            ordinateurs.add(nouveauOrdinateur);
        }
    }

    public void supprimerOrdinateur(Ordinateur ordinateur){
        if( ordinateurs.contains(ordinateur)) {
            ordinateurs.remove(ordinateur);
        }else{
            System.out.println("Ordinateur n'existe pas dans la liste");
        }
    }

    public ArrayList<Ordinateur> rechercherParPrix(double prix){
        ArrayList<Ordinateur> result = new ArrayList<>();
        for(Ordinateur ordinateur: ordinateurs){
            if( ordinateur.getPrix() == prix){
                result.add(ordinateur);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", ordinateurs=" + ordinateurs +
                '}';
    }


}
