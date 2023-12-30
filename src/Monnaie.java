public class Monnaie {
    private float montant;
    private int quantite;

    public Monnaie(float montant, int quantite) {
        this.montant = montant;
        this.quantite = quantite;
    }

    public float getMontant() {
        return montant;
    }

    public int getQuantite() {
        return quantite;
    }
}