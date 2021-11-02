public class Pizza {

    private int pizzaNummer;
    private String pizzaNavn;
    private String pizzaBeskrivelse;
    private double pizzaPris;

    public Pizza(int pizzaNummer, String pizzaNavn, String pizzaBeskrivelse, double pizzaPris){
        this.pizzaNummer = pizzaNummer;
        this.pizzaNavn = pizzaNavn;
        this.pizzaBeskrivelse = pizzaBeskrivelse;
        this.pizzaPris = pizzaPris;
    }

    public int getPizzaNummer() {
        return pizzaNummer;
    }

    public void setPizzaNavn(String pizzaNavn) {
        this.pizzaNavn = pizzaNavn;
    }

    public void setPizzaBeskrivelse(String pizzaBeskrivelse) {
        this.pizzaBeskrivelse = pizzaBeskrivelse;
    }

    public String getPizzaNavn() {
        return pizzaNavn;
    }

    public String getPizzaBeskrivelse() {
        return pizzaBeskrivelse;
    }

    public double getPizzaPris() {
        return pizzaPris;
    }



    public String toString(){
        return pizzaNummer + " " + pizzaNavn + " " + pizzaBeskrivelse + " " + pizzaPris;
    }

}
