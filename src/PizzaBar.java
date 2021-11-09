import java.io.FileNotFoundException;
import java.util.Scanner;

public class PizzaBar {

    private Scanner sc = new Scanner(System.in);
    private UserInterface ui = new UserInterface();
    private Menu menu = new Menu();
    private ListeAfOrdre listeAfOrdre = new ListeAfOrdre();
    Farve color = new Farve();


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

                    menu.printMenu();
                    break;
                case 2:
                    listeAfOrdre.tilføjPizzaOrdre();
                    break;
                case 3:
                    listeAfOrdre.printListeAfOrdre();
                    break;
                case 4:
                    listeAfOrdre.printListeAfOrdre();
                    System.out.println("\nHvilken ordre skal fjernes?");
                    System.out.println("Indtast ordre ID");
                    int remove = sc.nextInt() - 1;
                    listeAfOrdre.fjernOrdre(remove);
                    System.out.println(color.rød("Ordre " + (remove + 1) + " er fjernet fra ordrelisten"));
                    break;
                case 5:
                    try {
                        listeAfOrdre.afslutOrdre();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    //statistik
                case 7:
                    running = false;
                    break;

                default:
                    ui.defaultBesked();
                    break;
            }
        }
    }
}

