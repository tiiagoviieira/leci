package POO2324EPn;

public class Ticket {

    int ticketNumber;
    EventOccurrence occurrence;
    int quantidade;

    public Ticket (int ticketNumber, EventOccurrence occurrence, int quantidade) {
        this.ticketNumber = ticketNumber;
        this.occurrence = occurrence;
        this.quantidade = quantidade;
    }

    public int getTicketNumber () {
        return this.ticketNumber;
    }

    public void setTicketNumber (int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public int getQuantidade () {
        return this.quantidade;
    }

    public void setQuantidade (int quantidade) {
        this.quantidade = quantidade;
    } 

    public EventOccurrence getEventOcurrence () {
        return this.occurrence;
    }

    public void  setEventOcurrence (EventOccurrence ocurrence) {
        this.occurrence = ocurrence;
    } 

}
