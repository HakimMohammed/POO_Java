package Exercice_3.models;

import java.io.Serializable;

public class Client implements Serializable {
    private String nom, prenom, addresse, tel, email;

    public Client(String nom, String prenom, String addresse, String tel, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.addresse = addresse;
        this.tel = tel;
        this.email = email;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
