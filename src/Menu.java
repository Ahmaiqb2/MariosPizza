import java.util.ArrayList;

public class Menu {

    private ArrayList<Pizza> pizza;

    public Menu(){
        printMenu();
    }

    public void printMenu(){
        pizza = new ArrayList<>();
        Pizza pizza1 = new Pizza(1,"Vesuvio:",
                "tomatsause, ost, skinke, oregano",57);

        pizza.add(pizza1);
    }

    public void printeUd(){
        for (int i = 0; i < pizza.size(); i++){
            System.out.println(pizza.get(i));
        }
    }

    public ArrayList<Pizza> getPizza() {
        return pizza;
    }
}
