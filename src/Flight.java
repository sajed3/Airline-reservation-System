public class Flight {
   private  String FlightId;
 private String Origin;
 private String Destination;
 public String Date;
 public String Time;
 public String Price;
 public String Seats;

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

 public String getPrice() {
  return Price;
 }

 public void setPrice(String price) {
  Price = price;
 }

 public String getSeats() {
  return Seats;
 }

 public void setSeats(String seats) {
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
