import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
   ArrayList<User> arrayusers = new ArrayList<>();
    ArrayList <Flight> arrayflight  = new ArrayList<>();

    private Scanner scanner;

    public MainMenu(Scanner scanner) {

        this.arrayusers = arrayusers;

        this.scanner = scanner;
    }
    public void signUp(){
        System.out.println("enter your NAME");
        String name = scanner.next();
        System.out.println("enter your FAMILY NAME");
        String familyName = scanner.next();
        System.out.println("enter your USER_NAME");
        String userName = scanner.next();
        System.out.println("enter your PASSWORD");
        String password = scanner.next();
        User user1 = new User(name , familyName , userName , password);
//        System.out.println(user1);
        arrayusers.add(user1);
    }
    public void signIn(){
        System.out.println("enter your USERNAME");
        String userName1 = scanner.next();
        System.out.println("enter your PASSWORD");
       String password1 = scanner.next();


       for(User user : arrayusers ){
           if(user.getUserName().equals(userName1)  && user.getPassword().equals(password1)) {
               System.out.println("""
                       *********************
                       PASSENGER MENU OPTION
                       *********************
                       
                       
                       <1> change password
                       <2> search flight ticket 
                       <3> booking ticket 
                       <4> ticket cancellation
                       <5> booked teckets 
                       <6> add charge
                       <0> sign out
                       """);

               System.out.println("enter the option that you want");
               int opt = scanner.nextInt();
               switch (opt){
                   case 1:
                       System.out.println("please enter your new password");
                       String newPassword = scanner.next();
                       user.setPassword(newPassword);
                       System.out.printf("your new PASSWORD is "  + user.getPassword());

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
                       switch (optionSearch){
                           case 1 :
                               System.out.println("enter your origin that you want to search");
                               String searchOrigin =  scanner.next();
                               for(Flight flight : arrayflight){
                                   if (flight.getOrigin().equals(searchOrigin)) {
                                       System.out.printf("flightId : %s  |   origin: %s   |  destination : %S  | date : %s   | time:   %s   |   price: %s " + flight.getFlightId(),flight.getOrigin(),flight.getDestination(),flight.getDate(),flight.getTime(),flight.getPrice());
                                    break;
                                   }
                               }
                               break;

                           case 2 :
                               System.out.println("enter your destination that you want to search");
                               String searchDestination =  scanner.next();
                               for(Flight flight : arrayflight){
                                   if (flight.getDestination().equals(searchDestination)) {
                                       System.out.printf("flightId : %s  |   origin: %s   |  destination : %S  | date : %s   | time:   %s   |   price: %s " + flight.getFlightId(),flight.getOrigin(),flight.getDestination(),flight.getDate(),flight.getTime(),flight.getPrice());
                                       break;
                                   }
                               }
                               break;
                           case 3 :
                               System.out.println("enter your date that you want to search ");
                               String searchdate =  scanner.next();
                               for(Flight flight : arrayflight){
                                   if (flight.getDate().equals(searchdate)) {
                                       System.out.printf("flightId : %s  |   origin: %s   |  destination : %S  | date : %s   | time:   %s   |   price: %s " + flight.getFlightId(),flight.getOrigin(),flight.getDestination(),flight.getDate(),flight.getTime(),flight.getPrice());
                                       break;
                                   }

                               }
                               break;

                           case 4 :
                               System.out.println("enter your time that you want to search");
                               String searchtime = scanner.next();
                               for(Flight flight : arrayflight){
                                   if(flight.getTime().equals(searchtime)){
                                       System.out.printf("flightId : %s |  origin : %s | destination : %s  | date : %s  | time : %s  | price : %s  | seats : %s " + flight.getFlightId() , flight.getOrigin() , flight.getDestination() , flight.getDate() , flight.getTime() , flight.getPrice() , flight.getSeats());
                                   }
                               }
                               break;
                       }
                   case 5 :
                       System.out.println("enter your price that you want to search");
                       String searchprice = scanner.next();
                       for(Flight flight : arrayflight){
                           if(flight.getPrice().equals(searchprice)){
                               System.out.printf("flightId : %s |  origin : %s | destination : %s  | date : %s  | time : %s  | price : %s  | seats : %s " + flight.getFlightId() , flight.getOrigin() , flight.getDestination() , flight.getDate() , flight.getTime() , flight.getPrice() , flight.getSeats());
                           }
                       }
                       break;

               }


           }else{
               System.out.println("your username is not valid");
           }

       }
        }
//            public void changePassword(User user){
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
//                               for(Flight flight : arrayflight){
//                                   if (flight.getOrigin().equals(searchOrigin)) {
//                                       System.out.printf("flightId : %s  |   origin: %s   |  destination : %S  | date : %s   | time:   %s   |   price: %s " + flight.getFlightId(),flight.getOrigin(),flight.getDestination(),flight.getDate(),flight.getTime(),flight.getPrice());
//                                   }
//                               }
//                        }
//
//
//                }
//
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
