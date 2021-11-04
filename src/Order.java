
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Order {

    private ArrayList<Pizza> pizzaer = new ArrayList<>();
    private double pris = 0;
    private String henteTidspunkt;
    Menu menu = new Menu();

    public Order(ArrayList<Pizza> pizzaer, String henteTidspunkt){
        this.pizzaer=pizzaer;
        this.henteTidspunkt=henteTidspunkt;
        setPrice();
    }

    private void setPrice(){
        double price = 0;
        for(int i = 0; i < pizzaer.size(); i++){
            price += pizzaer.get(i).getPizzaPris();
        }
        this.pris=price;
    }

    public double getPris() {
        return pris;
    }

    public void addPizza(int pizzaNummer){
        pizzaer.add(menu.getPizza().get(pizzaNummer - 1));
   }

    public ArrayList<Pizza> getPizzaer() {
        return pizzaer;
    }

    public void finishOrder() throws FileNotFoundException {
        String order = pris + "_Pizzaer: ";
        for(int i = 0; i < pizzaer.size(); i++){
            order += pizzaer.get(i).getPizzaNavn() + ", ";
        }
        order += pris;
        File file = new File("data/orderHistory.txt");
        PrintStream ps = new PrintStream(new FileOutputStream(file, true));
        ps.println(order);
    }

    private String pizzaList(){
        String pizza = "";
        for(int i = 0; i < pizzaer.size(); i++){
            pizza += "Nr. " + pizzaer.get(i).getPizzaNummer() + " - " + pizzaer.get(i).getPizzaNavn() + ", pris: " + pizzaer.get(i).getPizzaPris() + "kr.";
            if(i < pizzaer.size()){
                pizza += "\n";
            }
        }
        return pizza;
    }

    public String toString(){
        return pizzaList() + "Afhentes: " + henteTidspunkt;
    }
}
