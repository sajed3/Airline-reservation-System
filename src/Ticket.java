import java.util.ArrayList;

public class Ticket {
    private int id;
    private User user;
    private Flight flight;

//    private Ticket .;

    public Ticket(int id, User user, Flight flight) {
        this.user = user;
        this.flight = flight;
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printTicket() {
        System.out.printf("Ticket<ID:%d, From: %s, To: %s>\n", this.id, this.flight.getOrigin(), this.flight.getDestination());
    }
}
