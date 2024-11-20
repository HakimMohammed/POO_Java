package Ex3;

import java.util.ArrayList;

public class Client {
    private String nom, prenom, addresse, email, ville, telephone;
    private ArrayList<Commande> commandesEffectués;

    public Client(String nom, String prenom, String addresse, String email, String ville, String telephone, ArrayList<Commande> commandesEffectués) {
        this.nom = nom;
        this.prenom = prenom;
        this.addresse = addresse;
        this.email = email;
        this.ville = ville;
        this.telephone = telephone;
        this.commandesEffectués = commandesEffectués;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public ArrayList<Commande> getCommandesEffectués() {
        return commandesEffectués;
    }

    public void setCommandesEffectués(ArrayList<Commande> commandesEffectués) {
        this.commandesEffectués = commandesEffectués;
    }

    public void ajouterCommande(Commande commande){
        if( commandesEffectués.contains(commande)){
            System.out.println("Commande déjà existe");
        } else {
            commandesEffectués.add(commande);
        }
    }

    public void supprimerCommande(Commande commande){
        if( commandesEffectués.contains(commande)) {
            commandesEffectués.remove(commande);
        } else {
            System.out.println("Commande n'existe pas dans la liste");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(nom).append(" ").append(prenom).append(", ")
                .append("addresse: ").append(addresse).append(", ")
                .append("email: ").append(email).append(", ")
                .append("ville: ").append(ville).append(", ")
                .append("telephone: ").append(telephone).append(", ")
                .append("les commandes éffectués: ");

        for (Commande commande : commandesEffectués) {
            result.append(commande.getReference()).append('\n'); // Assuming Commande has its own toString()
        }

        return result.toString();
    }
}
