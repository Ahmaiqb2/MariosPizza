
public class UserInterface {

    public void printStartBesked(){
        System.out.println("Velkommen til Marios Pizzabar!");
    }

    public void printMenu(){
        System.out.println("""
                    \n1) Se Menu.
                    2) Tilføj ordre.
                    3) Se aktive ordrer.
                    4) Fjern ordrer.
                    5) Færdiggør ordre.
                    7) Afslut programmet.""");
    }

    public void defaultBesked(){
        System.out.println("Denne kommando findes ikke");
    }

    public void menuBesked(){
        System.out.println("MENU:");
    }
}



