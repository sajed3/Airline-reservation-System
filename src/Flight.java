public class Flight {
    private String FlightId;
    private String Origin;
    private String Destination;
    public String Date;
    public String Time;
    public int Price;
    public int Seats;

    public Flight() {
    }

    public Flight(String flightId, String origin, String destination, String date, String time, int price, int seats) {
        FlightId = flightId;
        Origin = origin;
        Destination = destination;
        Date = date;
        Time = time;
        Price = price;
        Seats = seats;
    }

    public String getFlightId() {
        return FlightId;
    }

    public void setFlightId(String flightId) {
        FlightId = flightId;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int seats) {
        Seats = seats;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "FlightId='" + FlightId + '\'' +
                ", Origin='" + Origin + '\'' +
                ", Destination='" + Destination + '\'' +
                ", Date='" + Date + '\'' +
                ", Time='" + Time + '\'' +
                ", Price='" + Price + '\'' +
                ", Seats='" + Seats + '\'' +
                '}';
    }
}
