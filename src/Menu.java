import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public ArrayList<Pizza> pizza = new ArrayList<>();
    public ArrayList<Pizza> pizzaMenu = new ArrayList<>();
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
        for (int i = 0; i < pizza.size(); i++) {
            System.out.println(pizza.get(i));
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
        for (Pizza marios: pizza = new ArrayList<>()) {

        }

        Pizza pizza1 = new Pizza(1, "Vesuvio:",
                "tomatsauce, ost, skinke og oregano", 57);
        Pizza pizza2 = new Pizza(2, "Amerikaner:",
                "tomatsauce, ost, oksefars og oregano", 53);
        Pizza pizza3 = new Pizza(3, "Casiatore:",
                " tomatsauce, ost, pepperoni og oregano", 57);
        Pizza pizza4 = new Pizza(4, "Carbonara:",
                " tomatsauce, ost, kodsauce, spaghetti, cocktailpølser og oregano", 63);
        Pizza pizza5 = new Pizza(5, "Dennis:",
                " tomaatsauce , ost, skinke, pepperoni, cocktailpølser og oregano", 65);
        Pizza pizza6 = new Pizza(6, "Bertil:",
                "tomatsauce, ost, bacon, oregano", 57);
        Pizza pizza7 = new Pizza(7, "Silvia:",
                "tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano", 61);
        Pizza pizza8 = new Pizza(8, "Victoria:",
                "tomatsauce, ost, skinke, ananas, champignon, løg og oregano", 61);
        Pizza pizza9 = new Pizza(9, "Toronfo:",
                "tomatsauce, ost, skinke, bacon, kebab, chili og oregano", 61);
        Pizza pizza10 = new Pizza(10, "Capricciosa:",
                "tomatsauce, ost, skinke, champignon og oregano", 61);
        Pizza pizza11 = new Pizza(11, "Hawaii:",
                "tomatsauce, ost, skinke, ananas og oregano", 61);
        Pizza pizza12 = new Pizza(12, "Le Blissola:",
                "tomatsauce, ost, skinke, rejer og oregano", 61);
        Pizza pizza13 = new Pizza(13, "Venezia:",
                "tomatsauce, ost, skinke, bacon og oregano:", 61);
        Pizza pizza14 = new Pizza(14, "Nørrebro:",
                "tomatsauce, ost, kebab, champingon, salat, tomat og dressing, ", 61);
        Pizza pizza15 = new Pizza(15, "Mike Tyson XL:",
                "tomatsauce, ost, kylling, kebab, dressing, iceberg og tomat", 85);
        Pizza pizza16 = new Pizza(16, "Roma:",
                "tomatsauce, ost, oregano og prosciutto", 61);
        Pizza pizza17 = new Pizza(17, "Mette Frederiksen:",
                "tomatsauce, ost, basilikum og makrel", 61);
        Pizza pizza18 = new Pizza(18, "White truffle:",
                "Mornaysauce, trøffelolie, pesto og hvidløg", 85);
        Pizza pizza19 = new Pizza(19, "Vegan:",
                " tomatsauce, veganCheese, likeMeat og oregano", 57);
        Pizza pizza20 = new Pizza(20, "Holger Danske:",
                "tomatsauce, ost, bacon, bernaisesauce og champingion", 63);
        Pizza pizza21 = new Pizza(21, "Thyborøn XL:",
                "tomatsauce, ost, rejer, tun, ansjoser og  basilikum", 85);
        Pizza pizza22 = new Pizza(22, "Butter Chicken:",
                "Butterchikensauce, ost, persille og hvidløg", 57);
        Pizza pizza23 = new Pizza(23, "Sinbad:",
                "tomatsauce, ost, pepperoni, rød peber, løg, oliven, kebab og aubergine", 75);
        Pizza pizza24 = new Pizza(24, "Marios:",
                "tomatsauce, ost, rødløg og oregano", 61);
        Pizza pizza25 = new Pizza(25, "Alfonso:",
                "tomatsauce, ost, skinke, bacon, chili og oregano", 61);
        Pizza pizza26 = new Pizza(26, "After Eight:",
                "tomatsauce, ost, skinke, bacon, kebab, champignon og oregano", 61);
        Pizza pizza27 = new Pizza(27, "Study time:",
                "tomatsauce, ost,kylling og oregano", 61);
        Pizza pizza28 = new Pizza(28, "Bella Mia:",
                "tomatsauce, ost, skinke, rejer og oregano", 61);
        Pizza pizza29 = new Pizza(29, "Mamma mia XL:",
                "kødsauce, ost, skinke, rødløg og peber", 85);
        Pizza pizza30 = new Pizza(30, "Santa Maria:",
                "texmexsauce, ost, pepperoni, kylling, løg og  oregano", 61);


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
        pizza.add(pizza15);
        pizza.add(pizza16);
        pizza.add(pizza17);
        pizza.add(pizza18);
        pizza.add(pizza19);
        pizza.add(pizza20);
        pizza.add(pizza21);
        pizza.add(pizza22);
        pizza.add(pizza23);
        pizza.add(pizza24);
        pizza.add(pizza25);
        pizza.add(pizza26);
        pizza.add(pizza27);
        pizza.add(pizza28);
        pizza.add(pizza29);
        pizza.add(pizza30);
    }


    public void printMenu(){
        for (int i = 0; i < pizza.size(); i++){
            System.out.println(pizza.get(i));
        }
    }

    public ArrayList<Pizza> getPizza() {
        return pizza;
    }
}
