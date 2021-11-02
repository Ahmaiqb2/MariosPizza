import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Pizza> pizzaMenu = new ArrayList<>();
    //Pizza 1: Number, 2: Name, 3: ingredients, 4: price
    public void createMenu() {
        File file = new File("data/menu.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                addPizza(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("oof" + e);
        }
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzaMenu;
    }
    private void addPizza(String pizza){
        String[] stringList = pizza.split("_");
        int number = Integer.parseInt(stringList[0]);
        String name = stringList[1];
        String ingredients = stringList[2];
        double price = Double.parseDouble(stringList[3]);
        pizzaMenu.add(new Pizza(number,name,ingredients,price));
    }
}
