import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Order {

private int ordrenummer;
private ArrayList<Pizza> pizzaz;
private double pris;


public void finishOrder() throws FileNotFoundException {
    String order = "";
    File file = new File("data/orderHistory.txt");
    PrintStream ps = new PrintStream(new FileOutputStream(file, true));
    ps.println(order);
}
}
