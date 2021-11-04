import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class UserInterface {

    private UserInterface ui;
    private Menu menu = new Menu();
    private ListeAfOrdre listeAfOrdre = new ListeAfOrdre();

    //private PizzaBar application;
    //public UserInterface(PizzaBar application){
    //this.application = application;

    public void printStartBesked(){
        System.out.println("Velkommen til Marios Pizzabar!");
    }

    public void printMenu(){
        System.out.println("""
                    \n1) Se Menu.
                    2) Tilføj ordre.
                    3) Se aktive ordrer.
                    4) Fjern ordrer.
                    5) Afslut programmet.""");
    }

    public void defaultBesked(){
        System.out.println("Denne kommando findes ikke");
    }

    public void statistik(){

    }
    public void menuBesked(){
        System.out.println("MENU:");
    }
}



