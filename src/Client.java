public class Client {
    private String id;
    private float solde;
    private DistributeurAuto distributeur;

    public Client(String id, float solde) {
        this.id = id;
        this.solde = solde;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void insereargent(float montant, DistributeurAuto distributeur) {
        distributeur.crediterSolde(montant);
    }

    public void retireargent(float montant, DistributeurAuto distributeur) {
        distributeur.debiterSolde(montant);
    }

    public void impressionticket() {
        Ticket ticket = new Ticket(5.0);
        ticket.impressionTicket();
    }

    public void affichersolde() {
        System.out.println("Solde du client ID : " + id + " = " + solde);
    }
}