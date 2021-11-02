import java.util.Scanner;

public class PizzaBar {

    private Scanner sc = new Scanner(System.in);
    private UserInterface ui = new UserInterface();

    public void run() {
        boolean startGo = true;
        ui.startsMenu();

        while (startGo) {
            String input = sc.nextLine();


            switch (input) {

                case "1":

                case "2":

                case "3":

                case "4":

                case "9":
                    ui.farvelBesked();

                default:
                    System.out.println("Dette er ikke en mulighed");

            }
        }
    }
}
