import java.util.Scanner;

public class UserInterface {

    private UserInterface ui;
    private Menu menu = new Menu();
    private Order order = new Order();
    private ListeAfOrdre listeAfOrdre = new ListeAfOrdre();

    //private PizzaBar application;
    //public UserInterface(PizzaBar application){
    //this.application = application;


    public void start() {
        System.out.println("Velkommen til Marios Pizzabar!");

        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("""
                    1) Se Menu:
                    2) Tilføj ordre:
                    3) Se aktive ordrer:
                    4) Fjern ordrer:
                    5) For exit: """);

            int selection = sc.nextInt();
            sc.nextLine();
            switch (selection) {

                case 1:
                    menu.getMenu();
                    break;
                case 2:
                    listeAfOrdre.addPizzaToOrder();
                    break;
                case 3:
                    listeAfOrdre.printListeAfOrdre();
                case 4:
                    //lav metode fjern ordre
                    break;
                case 5:
                    running = false;
                    break;
            }


        }
    }
}



