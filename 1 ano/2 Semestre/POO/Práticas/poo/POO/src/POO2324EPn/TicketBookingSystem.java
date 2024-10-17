package POO2324EPn;
import java.util.*;

public class TicketBookingSystem implements ITicketBookingSystem {

    int varID = 1000;
    int tickedID = 0;

    Collection <EventOccurrence> eventOccurrenceList;
    List <Ticket> listOfTickets;

    public TicketBookingSystem () {
        eventOccurrenceList = new ArrayList<>();
        listOfTickets = new ArrayList<>();
    }

    public boolean addEventOccurrence(Event event, Place place, String schedule) {

        EventOccurrence isNew = new EventOccurrence(event, place, schedule);
        if (eventOccurrenceList.contains(isNew)) {
            return false;
        }
        isNew.setId(varID);
        eventOccurrenceList.add(isNew);
        this.varID++;
        return true;
    }

    public Collection <EventOccurrence> getEventOccurrences() {
        return eventOccurrenceList;
    }


    public int bookTickets (int eventId, int numTickets) {
        for (EventOccurrence occurrence : eventOccurrenceList) {
            if (occurrence.getId() == eventId) {
                if (occurrence.place.getCapacidade() >= numTickets) {
                    occurrence.place.setCapacidade(occurrence.place.getCapacidade() - numTickets);
                }
                Ticket ticket = new Ticket(tickedID, occurrence, numTickets);
                tickedID++;
                listOfTickets.add(ticket);
                return occurrence.place.getCapacidade();
            }
        }
        return 0;
    }

    public boolean cancelTickets (int ticketReference) {
        for (Ticket ticket : listOfTickets) {
            if (ticket.getTicketNumber() == ticketReference) {
                listOfTickets.remove(ticket);
                return true;
            }
        }
        return false;
    }


}
