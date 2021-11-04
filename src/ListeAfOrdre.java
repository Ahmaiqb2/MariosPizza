import java.util.ArrayList;
import java.util.Scanner;

public class ListeAfOrdre {

    ArrayList<Order> listeAfOrdre = new ArrayList<>();
    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);

    public ListeAfOrdre(){
    }

    public void addOrdre(Order order){
        listeAfOrdre.add(order);
    }

    public void addPizzaOrder(){
        ArrayList<Pizza> pizzaOrder = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("tilføj pizzaer:");

        boolean active = true;
        while(active){
            System.out.print("indtast pizza nr: ");
            String input = sc.nextLine();

            if(input.equalsIgnoreCase("menu")){
                System.out.println(menu.getPizza());
            }
            else if(addPizza(input)==null){
                System.out.println("denne pizza findes ikke");
            } else {
                pizzaOrder.add(addPizza(input));
            }
            boolean choice = true;
            while(choice) {
                System.out.println("Tilføj mere?");
                String answer = sc.nextLine();
                if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("ja")) {
                    choice = false;
                }
                else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("nej")) {
                    choice = false;
                    active = false;
                } else {
                    System.out.println("ugyldigt svar");
                }
            }
        }
        System.out.println("hvornår skal den hentes?");
        String pickupTime = sc.nextLine();
        listeAfOrdre.add(new Order(pizzaOrder, pickupTime));
    }

    private Pizza addPizza(String input){
        int number = Integer.parseInt(input);
        for(int i = 0; i < menu.getPizza().size(); i++){
            if(number==menu.getPizza().get(i).getPizzaNummer()){
                return menu.getPizza().get(i);
            }
        }
        return null;
    }

    public void removePizzaFromOrder(){
        System.out.println("Hvilken pizza skal fjernes");
    }
    public void printListeAfOrdre(){
        if (getListeAfOrdre().size() == 0){
            System.out.println("Der er ingen bestillinger");
        } else {
            for (int i = 0; i < getListeAfOrdre().size(); i++){
                System.out.println(getListeAfOrdre().get(i));
                System.out.println("Samlet pris: " + getListeAfOrdre().get(i).getPris() + "kr.");
            }
        }
    }

    public ArrayList<Order> getListeAfOrdre() {
        return listeAfOrdre;
    }
}

