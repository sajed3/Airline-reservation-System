import java.util.ArrayList;
import java.util.Scanner;

public class AdminMenu {

    private Scanner scanner;
    private ArrayList<Flight> arrayFlight;
    private ArrayList<Ticket> tickets;

    public AdminMenu(Scanner scanner, ArrayList<Flight> arrayFlight, ArrayList<Ticket> tickets) {
        this.scanner = scanner;
        this.arrayFlight = arrayFlight;
        this.tickets = tickets;
    }

    public void admin() {
        System.out.println("""
                ******************
                * Admin Menu Option *
                ******************
                 """);
        System.out.println("""
                <1> Add
                <2> Update
                <3> Remove
                <4> Flight schedules
                <5> sign out
                              
                """);
        System.out.println("enter your choice");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addFlight();
                break;

            case 2:

                update();
                break;
            case 3:
                System.out.print("enter that FLIGHT ID  that you wanna remove ");
                String flightIdRemove = scanner.next();
                boolean check = false;
                for (Ticket t : tickets) {
                    if (t.getFlight().getFlightId().equals(flightIdRemove)) {
                        check = true;
                    }
                }
                if (!check) {
                    for (Flight f : arrayFlight) {
                        if (f.getFlightId().equals(flightIdRemove)) {
                            arrayFlight.remove(f);
                        }
                    }
                } else{
                    System.out.println(".");
                }

            case 4:
                System.out.print("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                for (Flight f : arrayFlight) {
                    System.out.println(f);
                }
                System.out.print("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                break;

            case 5:
               return;


        }
    }


    private void addFlight() {
        System.out.println("your in addFlight menu");
        Flight flight01 = new Flight();
        System.out.println("enter your FLIGHT_ID");
        flight01.setFlightId(scanner.next());
        System.out.println("enter your ORIGIN");
        flight01.setOrigin(scanner.next());
        System.out.println("enter your DESTINATION");
        flight01.setDestination(scanner.next());
        System.out.println("enter your DATE");
        flight01.setDate(scanner.next());
        System.out.println("enter your TIME");
        flight01.setTime(scanner.next());
        System.out.println("enter your PRICE");
        flight01.setPrice(scanner.nextInt());
        System.out.println("enter your SEATS");
        flight01.setSeats(scanner.nextInt());
        arrayFlight.add(flight01);
        for (Flight f : arrayFlight)
            System.out.println(f);

    }

    private void update() {
        for (Flight f : arrayFlight) {
            System.out.println(f);
        }
        System.out.print("enter your FLIGHT_ID");
        String flightId = scanner.next();
        Flight f = null;
        for (Flight t : arrayFlight) {
            if (t.getFlightId().equals(flightId)) {
                f = t;
            }
        }
        System.out.print("here you can access the option of each Flight");
        System.out.println("""
                 "which option do you want to UPDATE  ???"
                <1> ORIGIN
                <2> DESTINATION 
                <3> DATE
                <4> TIME 
                <5> PRICE 
                <6> SEATS
                          """);
        int ch = scanner.nextInt();
        switch (ch) {
            case 1:
                System.out.print("enter your new ORIGIN");
                String newOrigin = scanner.next();
                f.setOrigin(newOrigin);
//                    break;

            case 2:
                System.out.print("enter your new DESTINATION ");
                String newDestination = scanner.next();
                f.setDestination(newDestination);
//                    break;

            case 3:
                System.out.print("enter your new DATE");
                String newDate = scanner.next();
                f.setDate(newDate);
//                    break;

            case 4:
                System.out.print("enter your new TIME");
                String newTime = scanner.next();
                f.setTime(newTime);
//                    break;

            case 5:
                System.out.print("enter your new PRICE");
                int newPrice = scanner.nextInt();
                f.setPrice(newPrice);
//                    break;

            case 6:
                System.out.print("enter your new SEATS");
                int newSeats = scanner.nextInt();
                f.setSeats(newSeats);
//                    break;
        }

    }
}


