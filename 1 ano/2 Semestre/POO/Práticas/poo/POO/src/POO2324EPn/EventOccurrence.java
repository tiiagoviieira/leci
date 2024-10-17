package POO2324EPn;

public class EventOccurrence {

    int id;
    Event event;
    Place place;
    String schedule;

    public EventOccurrence(Event event, Place place, String schedule) {
        this.event = event;
        this.place = place;
        this.schedule = schedule;
    }

    public int getId () {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Event getEvent() {
        return this.event;
    }

    public void setEvent (Event event) {
        this.event = event;
    }

    public Place getPlace() {
        return this.place;
    }

    public void setPlace (Place place ) {
        this.place = place;
    }

    public String getSchedule() {
        return this.schedule;
    }

    public void setSchedule (String schedule) {
        this.schedule = schedule;
    }

    public String toString () {
        return "Evento: " + this.event + "\nLocal: " + this.place + "\nData: " + this.schedule + "\n" + place.toString();
    }


}
