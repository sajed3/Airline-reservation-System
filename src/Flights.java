import java.util.ArrayList;
import java.util.Scanner;

public class Flights {

      private Scanner scanner;
      public void FlightObject(ArrayList arrayflight){

            Flight flight1 = new Flight();
            flight1.setFlightId("WX_12");
            flight1.setOrigin("Yazd");
            flight1.setDestination("Tehran");
            flight1.setDate("1401_12_10");
            flight1.setTime("12:30");
            flight1.setPrice("700,000");
            flight1.setSeats("51");
            arrayflight.add(flight1);
            Flight flight2 = new Flight();
            flight2.setFlightId("WZ_15");
            flight2.setOrigin("Mashhad");
            flight2.setDestination("Ahvaz");
            flight2.setDate("1401_12_11");
            flight2.setTime("08:00");
            flight2.setPrice("900_000");
            flight2.setSeats("245");
            arrayflight.add(flight2);
            Flight flight3 = new Flight();
            flight3.setFlightId("BG_22");
            flight3.setOrigin("Shiraz");
            flight3.setDestination("Tabriz");
            flight3.setDate("1401_12_12");
            flight3.setTime("22:30");
            flight3.setPrice("1_100_000");
            flight3.setSeats("12");
            arrayflight.add(flight3);
            Flight flight4 = new Flight();
            flight4.setFlightId("AZ_35");
            flight4.setOrigin("Isfahan");
            flight4.setDestination("Shiraz");
            flight4.setDate("1402_10_17");
            flight4.setTime("08:30");
            flight4.setPrice("500_00");
            flight4.setSeats("42");
            arrayflight.add(flight4);
            Flight flight5 = new Flight();
            flight5.setFlightId("SN_44");
            flight5.setOrigin("Tehran");
            flight5.setDestination("Sari");
            flight5.setDate("1402_06_28");
            flight5.setTime("09:45");
            flight5.setPrice("800_000");
            flight5.setSeats("55");
            arrayflight.add(flight5);

      }
}

