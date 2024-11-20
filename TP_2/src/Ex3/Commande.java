package Ex3;

import java.util.Date;

public class Commande {
    private String reference;
    private Client client;
    private Date date;
    private boolean etat; // Might change to String

    public Commande(String reference, Client client, Date date, boolean etat) {
        this.reference = reference;
        this.client = client;
        this.date = date;
        this.etat = etat;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Commande numero "+reference+"\n" +
                "   client: " +client+
                "   date: " + date +"\n"+
                "   etat: " + etat+"\n";
    }
}
