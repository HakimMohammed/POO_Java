package Exercice_3.metier;

import Exercice_3.models.Client;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierClientImpl implements IMetier<Client> {
    List<Client> clients = new ArrayList<>();
    File file = new File("TP_6/src/Exercice_3/repertoire/clients.dat");

    @Override
    public Client add(Client o) {
        clients.add(o);
        return o;
    }

    @Override
    public List<Client> getAll() {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            clients = (List<Client>) objectInputStream.readObject();
            return clients;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public Client findByNom(String nom) {
        for(Client client: clients) {
            if(client.getNom().contains(nom)) {
                return client;
            }
        }
        return null;
    }

    @Override
    public void delete(String nom) {
        clients.removeIf(client -> client.getNom().equalsIgnoreCase(nom));
    }

    @Override
    public void saveAll() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(clients);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
