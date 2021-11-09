import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ListeAfOrdre {

    ArrayList<Ordre> listeAfOrdre = new ArrayList<>();
    Menu menu = new Menu();
    Farve color = new Farve();


    public ListeAfOrdre() {
    }


    public void tilføjPizzaOrdre() {
        ArrayList<Pizza> pizzaOrdre = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Tilføj pizzaer:");

        boolean aktiv = true;
        while (aktiv) {
            System.out.print("Indtast pizza nr: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("menu")) {
                System.out.println(menu.getPizza());
            } else if (addPizza(input) == null) {
                System.out.println("Denne pizza findes ikke");
            } else {
                pizzaOrdre.add(addPizza(input));
                System.out.println("Pizza nummer " + input + " er tilføjet til ordre.");
            }
            boolean valg = true;
            while (valg) {
                System.out.println("Vil du tilføje mere? (ja/nej)");
                String answer = sc.nextLine();
                if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("ja")) {
                    valg = false;
                } else if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("nej")) {
                    valg = false;
                    aktiv = false;
                } else {
                    System.out.println("Ugyldigt svar");
                }
            }
        }
        System.out.println("Hvornår skal ordren hentes?");
        String henteTidspunkt = sc.nextLine();
        listeAfOrdre.add(new Ordre(pizzaOrdre, henteTidspunkt));
        System.out.println(color.grøn("Ordre oprettet."));
    }

    private Pizza addPizza(String input) {
        int nummer = Integer.parseInt(input);
        for (int i = 0; i < menu.getPizza().size(); i++) {
            if (nummer == menu.getPizza().get(i).getPizzaNummer()) {
                return menu.getPizza().get(i);
            }
        }
        return null;
    }

    public void fjernOrdre(int id) {
        listeAfOrdre.remove(id);
    }

    public void afslutOrdre() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String ordre = "";
        boolean afslutOrdre = true;
        while (afslutOrdre) {
            System.out.println(" ");
            System.out.print("Hvilken ordre skal færdiggøres? - type 'see orders' to see orders: ");
            String valg = sc.nextLine();
            if (valg.equalsIgnoreCase("orders")) {
                printListeAfOrdre();
            }
            if (valg.matches("\\d+")) {
                ordre = listeAfOrdre.get(Integer.parseInt(valg) - 1).afslutOrdre();
                afslutOrdre = false;
            }
        }
        File file = new File("data/ordreHistorik.txt");
        PrintStream ps = new PrintStream(new FileOutputStream(file, true));
        ps.println(ordre);
        System.out.println(color.gul("Ordren er færdiggjort og tilføjet til ordrehistoriken"));
    }


    public void printListeAfOrdre() {
        if (getListeAfOrdre().size() == 0) {
            System.out.println("Der er ingen bestillinger");
        } else {
            for (int i = 0; i < getListeAfOrdre().size(); i++) {
                System.out.println("Ordre ID: " + (i + 1));
                System.out.println(getListeAfOrdre().get(i));
                System.out.println("Samlet pris: " + getListeAfOrdre().get(i).getPris() + "kr.");
                System.out.println(color.grøn("Ordre ID: " + (i + 1)));

            }
        }
    }


    public ArrayList<Ordre> getListeAfOrdre() {
        return listeAfOrdre;
    }


}


