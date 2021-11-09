import java.util.ArrayList;

public class Ordre {

    private ArrayList<Pizza> pizzaer = new ArrayList<>();
    private double pris = 0;
    private String henteTidspunkt;

    public Ordre(ArrayList<Pizza> pizzaer, String henteTidspunkt) {
        this.pizzaer = pizzaer;
        this.henteTidspunkt = henteTidspunkt;
        setPris();
    }


    private void setPris() {
        for (int i = 0; i < pizzaer.size(); i++) {
            pris += pizzaer.get(i).getPizzaPris();
        }
        this.pris = pris;
    }

    public double getPris() {
        return pris;
    }

    public String afslutOrdre() {
        String resultat = "";
        for (int i = 0; i < pizzaer.size(); i++) {
            resultat += pizzaer.get(i).getPizzaNummer();
            if (i < pizzaer.size() - 1) {
                resultat += " ";
            }
        }
        resultat += "_" + pris;
        return resultat;
    }

    private String pizzaListe() {
        String pizza = "";
        for (int i = 0; i < pizzaer.size(); i++) {
            pizza += "Nr. " + pizzaer.get(i).getPizzaNummer() + " - " + pizzaer.get(i).getPizzaNavn()
                    + ", pris: " + pizzaer.get(i).getPizzaPris() + "kr.";
            if (i < pizzaer.size()) {
                pizza += "\n";
            }
        }
        return pizza;
    }

    public String toString() {
        return pizzaListe() + "Afhentes: " + henteTidspunkt;
    }
}
