public class Farve {


    public String farveTekst(String farve, String tekst) {
        String nulstilFarve = "\u001B[0m";
        return farve + tekst + nulstilFarve;
    }

    public String grøn(String input) {
        return GRØN + input + RESET;

    }

    public String rød(String input) {
        return red + input + RESET;
    }

    public String gul(String input) {
        return gul + input + RESET;
    }


    public final String GRØN = "\u001B[32m";
    public final String red = "\u001B[31m";
    public final String gul = "\u001B[33m";
    public final String RESET = "\u001B[0m";


}
