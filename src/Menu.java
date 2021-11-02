import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Pizza> pizza = new ArrayList<>();
    private ArrayList<Pizza> pizzaMenu = new ArrayList<>();
    //Pizza 1: Number, 2: Name, 3: ingredients, 4: price

    public Menu() {
        menuIndhold();
        createMenu();
    }

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

    public void getMenu() {
        for (int i = 0; i < pizzaMenu.size(); i++) {
            System.out.println(pizzaMenu.get(i));
        }
    }

    private void addPizza(String pizza) {
        String[] stringList = pizza.split("_");
        int number = Integer.parseInt(stringList[0]);
        String name = stringList[1];
        String ingredients = stringList[2];
        double price = Double.parseDouble(stringList[3]);
        pizzaMenu.add(new Pizza(number, name, ingredients, price));
    }

    public void menuIndhold() {
        pizza = new ArrayList<>();
        Pizza pizza1 = new Pizza(1, "Vesuvio:",
                "tomatsauce, ost, skinke og oregano", 57.0);
        Pizza pizza2 = new Pizza(2, "Amerikaner",
                "tomatsauce, ost, oksefars og oregano", 53);
        Pizza pizza3 = new Pizza(3, "Casiatore",
                " tomatsauce, ost, pepperoni og oregano", 57);
        Pizza pizza4 = new Pizza(4, "Carbonara",
                "tomatsauce, ost, kodsauce, spaghetti, cocktailpølser og oregano", 63);
        Pizza pizza5 = new Pizza(5, "Dennis",
                "tomaatsauce, ost, skinke, pepperoni, cocktailpølser og oregano", 65);
        Pizza pizza6 = new Pizza(6, "Bertil",
                "tomatsauce, ost, bacon, oregano", 57);
        Pizza pizza7 = new Pizza(7, "Silvia",
                "tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano", 61);
        Pizza pizza8 = new Pizza(8, "Victoria",
                "tomatsauce, ost, skinke, ananas, champignon, løg og oregano", 61);
        Pizza pizza9 = new Pizza(9, "Toronfo",
                "tomatsauce, ost, skinke, bacon, kebab, chili og oregano", 61);
        Pizza pizza10 = new Pizza(10, "Capricciosa",
                "tomatsauce, ost, skinke, champignon og oregano", 61);
        Pizza pizza11 = new Pizza(11, "Hawai",
                "tomatsauce, ost, skinke, ananas og oregano", 61);
        Pizza pizza12 = new Pizza(12, "Le Blissola",
                "tomatsauce, ost, skinke, rejer og oregano", 61);
        Pizza pizza13 = new Pizza(13, "Venezia",
                "tomatsauce, ost, skinke, bacon og oregano", 61);
        Pizza pizza14 = new Pizza(14, "Mafia",
                "tomatsauce, ost, pepperoni, bacon, løg, oregano", 61);

        pizza.add(pizza1);
        pizza.add(pizza2);
        pizza.add(pizza3);
        pizza.add(pizza4);
        pizza.add(pizza5);
        pizza.add(pizza6);
        pizza.add(pizza7);
        pizza.add(pizza8);
        pizza.add(pizza9);
        pizza.add(pizza10);
        pizza.add(pizza11);
        pizza.add(pizza12);
        pizza.add(pizza13);
        pizza.add(pizza14);
    }

    /*public void printMenu(){
        for (int i = 0; i < pizza.size(); i++){
            System.out.println(pizza.get(i));
        }
    }*/

    public ArrayList<Pizza> getPizza() {
        return pizza;
    }
}
