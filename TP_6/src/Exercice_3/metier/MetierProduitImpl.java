package Exercice_3.metier;

import Exercice_3.models.Produit;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {
    List<Produit> produits = new ArrayList<>();
    File file = new File("TP_6/src/Exercice_3/repertoire/produits.dat");

    @Override
    public Produit add(Produit o) {
        produits.add(o);
        return o;
    }

    @Override
    public List getAll() {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            produits = (List<Produit>) objectInputStream.readObject();
            return produits;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public Produit findByNom(String nom) {
        for(Produit produit: produits) {
            if(produit.getNom().contains(nom)) {
                return produit;
            }
        }
        return null;
    }

    @Override
    public void delete(String nom) {
        produits.removeIf(produit -> produit.getNom().equalsIgnoreCase(nom));
    }

    @Override
    public void saveAll() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(produits);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
