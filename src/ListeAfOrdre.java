import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ListeAfOrdre {

    ArrayList<Order> listeAfOrdre = new ArrayList<>();
    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);
    Colors color = new Colors();


    public ListeAfOrdre() {
    }

    public void addOrdre(Order order) {
        listeAfOrdre.add(order);
    }

    public void addPizzaOrder() {
        ArrayList<Pizza> pizzaOrder = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Tilføj pizzaer:");

        boolean active = true;
        while (active) {
            System.out.print("Indtast pizza nr: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("menu")) {
                System.out.println(menu.getPizza());
            } else if (addPizza(input) == null) {
                System.out.println("Denne pizza findes ikke");
            } else {
                pizzaOrder.add(addPizza(input));
                System.out.println("Pizza nummer " + input + " er tilføjet til ordre.");
            }
            boolean choice = true;
            while (choice) {
                System.out.println("Vil du tilføje mere? (ja/nej)");
                String answer = sc.nextLine();
                if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("ja")) {
                    choice = false;
                } else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("nej")) {
                    choice = false;
                    active = false;
                } else {
                    System.out.println("Ugyldigt svar");
                }
            }
        }
        System.out.println("Hvornår skal ordren hentes?");
        String pickupTime = sc.nextLine();
        listeAfOrdre.add(new Order(pizzaOrder, pickupTime));
        System.out.println(color.grøn("Ordre oprettet."));
    }

    private Pizza addPizza(String input) {
        int number = Integer.parseInt(input);
        for (int i = 0; i < menu.getPizza().size(); i++) {
            if (number == menu.getPizza().get(i).getPizzaNummer()) {
                return menu.getPizza().get(i);
            }
        }
        return null;
    }

    public void removeOrder(int id) {
        listeAfOrdre.remove(id);
    }

   /* public void finishOrder(Order order) throws FileNotFoundException {
        order.finishOrder();
        removeOrder(id);*/

    public void finishOrder() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String order = "";
        boolean finishingOrder = true;
        while (finishingOrder) {
            System.out.println(" ");
            System.out.print("Hvilken ordre skal færdiggøres? - type 'see orders' to see orders: ");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("orders")) {
                printListeAfOrdre();
            }
            if(choice.matches("\\d+")){
                order = listeAfOrdre.get(Integer.parseInt(choice)-1).finishOrder();
                finishingOrder = false;
            }
        }
        File file = new File("data/orderHistory.txt");
        PrintStream ps = new PrintStream(new FileOutputStream(file, true));
        ps.println(order);
        System.out.println(color.gul("Ordren er færdiggjort og tilføjet til ordrehistoriken"));
    }





    public void printListeAfOrdre(){
        if (getListeAfOrdre().size() == 0){
            System.out.println("Der er ingen bestillinger");
        } else {
            for (int i = 0; i < getListeAfOrdre().size(); i++) {
                System.out.println("Ordre ID: " + (i+1));
                System.out.println(getListeAfOrdre().get(i));
                System.out.println("Samlet pris: " + getListeAfOrdre().get(i).getPris() + "kr.");
                System.out.println(color.grøn("Ordre ID: " + (i+1)));

            }
        }
    }

    public ArrayList<Order> getListeAfOrdre() {
        return listeAfOrdre;
    }


    }


