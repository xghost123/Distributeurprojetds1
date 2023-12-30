public class Ticket {
    public double montantretire;
    public Date dateop;

    public Ticket(double montantretire) {
        this.montantretire = montantretire;
    }
    public Date getDateOp() {
        return dateop;
    }

    public void setDateOp(Date dateop) {
        this.dateop = dateop;
    }


    public void impressionTicket() {
        System.out.println("Montant retiré : " + montantretire);
        System.out.println("Date operation : " + dateop);
    }
}