import java.util.Scanner;

public class PizzaBar {

    private Scanner sc = new Scanner(System.in);
    private UserInterface ui = new UserInterface();
    private Menu menu = new Menu();

    public void run() {
        boolean startGo = true;
        ui.velkomstBesked();
        ui.startsMenu();

        while (startGo) {
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    System.out.println("case 1");
                    menu.getMenu();
                    break;
                case "2":

                    break;

                case "3":

                    break;

                case "4":

                    break;

                case "9":
                    ui.farvelBesked();
                    break;

                default:
                    System.out.println("Dette er ikke en mulighed");

            }
        }
    }
}
