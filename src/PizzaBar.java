import java.util.Scanner;

public class PizzaBar {

    private Scanner sc = new Scanner(System.in);
    private UserInterface ui = new UserInterface();
    private Menu menu = new Menu();
    private Order order = new Order();
    private ListeAfOrdre listeAfOrdre = new ListeAfOrdre();

    public void start() {
        ui.printStartBesked();

        boolean running = true;
        while (running) {
            ui.printMenu();
            int selection = sc.nextInt();
            sc.nextLine();
            switch (selection) {

                case 1:
                    ui.menuBesked();
                    //menu.getMenu();
                    menu.printMenu();
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

                default:
                    ui.defaultBesked();
                    break;
            }
        }
    }
}

