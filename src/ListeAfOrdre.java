import java.util.ArrayList;
import java.util.Scanner;

public class ListeAfOrdre {

    ArrayList<Order> listeAfOrdre = new ArrayList<>();
    Menu menu = new Menu();
    Order order = new Order();
    Scanner sc = new Scanner(System.in);

    public ListeAfOrdre(){
    }

    public void addOrdre(Order order){
        listeAfOrdre.add(order);
    }

    public void addPizzaToOrder(){
        System.out.println("Hvilken pizza kunne du tænke dig?");
        String input = sc.nextLine();
        if (input.equalsIgnoreCase(String.valueOf(menu.getPizza()))){
            for (int i = 0; i < menu.getPizza().size(); i++){
                order.addPizza(i);
            }
        } else {
            System.out.println(input + " findes ikke på menukortet");
        }
    }

    public void removePizzaFromOrder(){
        System.out.println("Hvilken pizza skal fjernes");
    }


    public void printListeAfOrdre(){
        if (getListeAfOrdre().size() == 0){
            System.out.println("Der er ingen bestillinger");
        } else {
            for (int i = 0; i < getListeAfOrdre().size(); i++){
                System.out.println(getListeAfOrdre().get(i).getPizzaer().get(i));
            }
        }
    }

    public ArrayList<Order> getListeAfOrdre() {
        return listeAfOrdre;
    }
}

