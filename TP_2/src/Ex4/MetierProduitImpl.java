package Ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MetierProduitImpl implements IMetierProduit{
    List<Produit> produits = new ArrayList<>();
    @Override
    public Produit addProduit(Produit p) {
        produits.add(p);
        return p;
    }

    @Override
    public List<Produit> getAll() {
        return produits;
    }

    @Override
    public List<Produit> findByNom(String motCle) {
        return produits.stream()
                .filter(p -> p.getNom().toLowerCase().contains(motCle.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public Produit findById(long id) {
        return produits.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void delete(long id) {
        produits.removeIf(p -> p.getId() == id);
    }
}
