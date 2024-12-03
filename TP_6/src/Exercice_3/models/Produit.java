package Exercice_3.models;

import java.io.Serializable;

public class Produit implements Serializable {
    private final String nom, marque, description;
    private final double prix;
    private final int nombre_stock;

    public Produit(String nom, String marque, String description, double prix, int nombre_stock) {
        this.nom = nom;
        this.marque = marque;
        this.description = description;
        this.prix = prix;
        this.nombre_stock = nombre_stock;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "{nom: "+nom+", marque: "+marque+", description: "+description+",prix: "+prix+",nombre_stock: "+nombre_stock+"}";
    }
}
