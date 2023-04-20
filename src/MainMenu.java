import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    ArrayList<User> arrayUsers;
    ArrayList<Flight> arrayFlight;
    ArrayList<Ticket> tickets;

    //    Flights flights = new Flights();
    private Scanner scanner;
    public User charge;
    AdminMenu adminMenu;//= new AdminMenu(scanner, arrayFlight);

    public MainMenu(Scanner scanner) {
        arrayFlight = new ArrayList<>();
        arrayUsers = new ArrayList<>();
        tickets = new ArrayList<>();
        adminMenu = new AdminMenu(scanner, arrayFlight, tickets);

        this.scanner = scanner;
        initialize();

    }

    private void initialize() {
        Flight flight1 = new Flight("WX_12", "Yazd", "Tehran", "1401_12_10", "12:30", 700_000, 51);
        arrayFlight.add(flight1);
        Flight flight2 = new Flight("WZ_15", "Mashhad", "Ahvaz", "1401_12_11", "08:00", 900_000, 245);
        arrayFlight.add(flight2);
        Flight flight3 = new Flight("BG_22", "Shiraz", "Tabriz", "1401_12_12", "22:30", 1_100_000, 12);
        arrayFlight.add(flight3);
        Flight flight4 = new Flight("AZ_35", "Isfahan", "Shiraz", "1402_10_17", "08:30", 500_000, 42);
        arrayFlight.add(flight4);
        Flight flight5 = new Flight("SN_44", "Tehran", "Sari", "1402_06_28", "09:45", 800_000, 55);
        arrayFlight.add(flight5);
    }

    public void signUp() {
        System.out.println("enter your NAME");
        String name = scanner.next();
        System.out.println("enter your FAMILY NAME");
        String familyName = scanner.next();
        System.out.println("enter your USER_NAME");
        String userName = scanner.next();
        System.out.println("enter your PASSWORD");
        String password = scanner.next();
        User user1 = new User(name, familyName, userName, password);
//        System.out.println(user1);
        arrayUsers.add(user1);
    }

    public void signIn() {
        System.out.println("enter your USERNAME");
        String userName1 = scanner.next();
        System.out.println("enter your PASSWORD");
        String password1 = scanner.next();
        if (userName1.equals("Admin") && password1.equals("Admin")) {
            adminMenu.admin();
        } else {
            for (User user : arrayUsers) {
                if (user.getUserName().equals(userName1) && user.getPassword().equals(password1)) {
                    System.out.println("""
                            *********************
                            PASSENGER MENU OPTION
                            *********************
                                                   
                                                   
                            <1> change password
                            <2> search flight ticket 
                            <3> booking ticket 
                            <4> ticket cancellation
                            <5> booked tickets 
                            <6> add charge
                            <0> sign out
                            """);

                    System.out.println("enter the option that you want");
                    int opt = scanner.nextInt();
                    switch (opt) {
                        case 1:
                            System.out.println("please enter your new password");
                            String newPassword = scanner.next();
                            user.setPassword(newPassword);
                            System.out.printf("your new PASSWORD is " + user.getPassword());

                            break;

                        case 2:
                            System.out.println("SEARCH OPTIONS");
                            System.out.println("""
                                    <1> origin
                                    <2> destination
                                    <3> date
                                    <4> time
                                    <5> price
                                    """);
                            int optionSearch = scanner.nextInt();
                            switch (optionSearch) {
                                case 1:
                                    System.out.println("enter your origin that you want to search");
                                    String searchOrigin = scanner.next();

                                    for (Flight flight : arrayFlight) {

                                        if (flight.getOrigin().equals(searchOrigin)) {

                                            System.out.printf("flightId : %s  |   origin: %s   |  destination : %S  | date : %s   | time:   %s   |   price: %d ", flight.getFlightId(), flight.getOrigin(), flight.getDestination(), flight.getDate(), flight.getTime(), flight.getPrice());
                                            break;
                                        }
                                    }
                                    break;

                                case 2:
                                    System.out.println("enter your destination that you want to search");
                                    String searchDestination = scanner.next();
                                    for (Flight flight : arrayFlight) {
                                        if (flight.getDestination().equals(searchDestination)) {
                                            System.out.printf("flightId : %s  |   origin: %s   |  destination : %S  | date : %s   | time:   %s   |   price: %d ", flight.getFlightId(), flight.getOrigin(), flight.getDestination(), flight.getDate(), flight.getTime(), flight.getPrice());
                                            break;
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("enter your date that you want to search ");
                                    String searchdate = scanner.next();
                                    for (Flight flight : arrayFlight) {
                                        if (flight.getDate().equals(searchdate)) {
                                            System.out.printf("flightId : %s  |   origin: %s   |  destination : %S  | date : %s   | time:   %s   |   price: %d ", flight.getFlightId(), flight.getOrigin(), flight.getDestination(), flight.getDate(), flight.getTime(), flight.getPrice());
                                            break;
                                        }

                                    }
                                    break;

                                case 4:
                                    System.out.println("enter your time that you want to search");
                                    String searchtime = scanner.next();
                                    for (Flight flight : arrayFlight) {
                                        if (flight.getTime().equals(searchtime)) {
                                            System.out.printf("flightId : %s |  origin : %s | destination : %s  | date : %s  | time : %s  | price : %d  | seats : %d ", flight.getFlightId(), flight.getOrigin(), flight.getDestination(), flight.getDate(), flight.getTime(), flight.getPrice(), flight.getSeats());
                                        }
                                    }
                                    break;
                                case 5:
                                    System.out.println("enter your price that you want to search");
                                    int searchprice = scanner.nextInt();
                                    for (Flight flight : arrayFlight) {
                                        if (flight.getPrice() == searchprice) {
                                            System.out.printf("flightId : %s |  origin : %s | destination : %s  | date : %s  | time : %s  | price : %d  | seats : %d ", flight.getFlightId(), flight.getOrigin(), flight.getDestination(), flight.getDate(), flight.getTime(), flight.getPrice(), flight.getSeats());
                                        }
                                    }
                                    break;
                            }
                            break;

                        case 3:
                            System.out.println("all FLIGHTS");
                            for (Flight f : arrayFlight) {
                                System.out.println(f);
                            }
                            System.out.print("""
                                    which flight do you want to book?
                                    enter the FLIGHT ID :)))))
                                                                    
                                    """);
                            String flightId = scanner.next();
                            for (Flight l : arrayFlight) {
                                if (flightId.equals(l.getFlightId())) {
                                    if (user.getCharge() >= l.getPrice()) {
                                        user.setCharge(user.getCharge() - l.getPrice());
                                        Ticket ticket = new Ticket(tickets.size(), user, l);
                                        tickets.add(ticket);
                                        ticket.printTicket();
                                    } else {
                                        System.out.println("your charge is not enough");
                                    }

                                }
                            }
                            break;
                        case 4:
                            System.out.print("if you wanna cancel a flight  please enter the (TICKET ID)");
                            int ticketIdCancel = scanner.nextInt();
                            for (Ticket t : tickets) {
                                if (ticketIdCancel == t.getId()) {
                                    System.out.printf("id %d | user %s | flight %s ", t.getId(), t.getUser(), t.getFlight());
                                    arrayFlight.remove(t.getId());
                                    tickets.remove(t.getUser());
                                    tickets.remove(t.getFlight());

                                } else {
                                    System.out.println("this ticketID isn't found");
                                }
                            }

                        case 5:
                            System.out.println("i will show you your booked ticket");
                            for (Ticket t : tickets) {
                                if (t.getUser().getUserName().equals(user.getUserName())) {
                                    t.printTicket();
                                }

                            }
                            break;

                        case 6:
                            System.out.println("here you can ADD as much as you want to your charge ");
                            System.out.println("enter the amount you wanna ADD to your charge");
                            int recharge = scanner.nextInt();
                            user.setCharge(recharge);
                            System.out.println(recharge);
                            break;
                        case 0:
                            return;


                    }

                } else {
                    System.out.println("your username is not valid");
                }
            }

        }
    }

    //                public void changePassword(User user){
//                System.out.println("enter the option that you want");
//                int opt = scanner.nextInt();
//                switch (opt){
//                    case 1:
//                        System.out.println("please enter your new password");
//                        String newPassword = scanner.next();
//                        user.setPassword(newPassword);
//                        System.out.printf("your new PASSWORD is "  + user.getPassword());
//
//                        break;
//
//                    case 2:
//                        System.out.println("SEARCH OPTIONS");
//                        System.out.println("""
//                                <1> origin
//                                <2> destination
//                                <3> date
//                                <4> time
//                                <5> price
//                                """);
//                        int optionSearch = scanner.nextInt();
//                        switch (optionSearch){
//                            case 1 :
//                               String searchOrigin =  scanner.next();
//                               for(Flight flight : arrayFlight){
//                                   if (flight.getOrigin().equals(searchOrigin)) {
//                                       System.out.printf("flightId : %s  |   origin: %s   |  destination : %S  | date : %s   | time:   %s   |   price: %s " + flight.getFlightId(),flight.getOrigin(),flight.getDestination(),flight.getDate(),flight.getTime(),flight.getPrice());
//                                   }
//                               }
//                        }
//
//
//                }
////
//}
    public void run() {
        while (true) {
            System.out.println("""
                    **************************************
                    * WELCOME TO AIRLINE RESERVATION SYSTEM *
                    **************************************
                    """);
            System.out.println("MENO OPTION");
            System.out.println("""
                    <1> sign in 
                    <2> sign up
                    """);
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    signIn();
                    break;
                case 2:
                    signUp();
            }
        }
    }
}
