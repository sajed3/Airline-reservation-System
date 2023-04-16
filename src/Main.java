import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainMenu mainMenu = new MainMenu(scanner);
        mainMenu.run();
        Flights flights = new Flights();



    }


}