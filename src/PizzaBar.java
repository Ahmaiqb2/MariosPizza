import java.util.Scanner;

public class PizzaBar {

    private Scanner sc = new Scanner(System.in);
    private UserInterface ui = new UserInterface();

    public void run() {
        boolean startGo = true;

        while (startGo) {
            String input = sc.nextLine();
            ui.startsMenu();

            switch (input) {

                case "1":

                case "2":

                case "3":

                case "4":

            }
        }
    }
}
