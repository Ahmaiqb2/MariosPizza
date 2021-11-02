import java.util.Scanner;

public class UserInterface {

    Scanner sc = new Scanner(System.in);

    public void velkomstBesked(){
        System.out.println("""
                Velkommen til Marios Pizza!
                """);
    }

    public void startsMenu(){
        System.out.println("""
                1: Se Menu:
                2: Bestil Pizza:
                3: Se Bestillinger:
                9: For Exit:""");
    }

    public void farvelBesked(){
        System.out.println("Tak for besøget hos Marios Pizza");
        System.exit(0);
    }
}
