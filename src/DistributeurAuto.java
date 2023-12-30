import java.util.HashMap;
import java.util.Map;

public class DistributeurAuto {
    private float solde;
    private Map<Monnaie, Integer> moneystock;

    public DistributeurAuto() {
        this.solde = 500.0f;
        this.moneystock = new HashMap<>();
    }

    public void ajouteargent(Monnaie monnaie, int quantite) {
        moneystock.put(monnaie, moneystock.getOrDefault(monnaie, 0) + quantite);
    }

    public void retireargent(Monnaie monnaie, int quantite) {
        if (moneystock.containsKey(monnaie)) {
            int quantiteActuelle = moneystock.get(monnaie);
            if (quantiteActuelle >= quantite) {
                moneystock.put(monnaie, quantiteActuelle - quantite);
            } else {
                System.out.println("Quantité insuffisante de monnaie disponible.");
            }
        } else {
            System.out.println("Monnaie non disponible dans le stock.");
        }
    }

    public void crediterSolde(float montant) {
        solde += montant;
    }

    public void debiterSolde(float montant) {
        if (solde >= montant) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant.");
        }
    }

    public void impressionticket() {
        Ticket ticket = new Ticket(10.0);
        ticket.impressionTicket();
    }

    public float getSolde() {
        return solde;
    }

    public void afficherSolde() {
        System.out.println("Solde du distributeur : " + solde);
    }
}