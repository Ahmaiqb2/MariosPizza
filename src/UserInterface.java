public class UserInterface {

    public void velkomstBesked(){
        System.out.println("""
                Velkommen til Marios Pizza!
                """);
    }

    public void startsMenu(){
        System.out.println("""
                1: Se menu:
                2: Bestil pizza:
                9: For exit""");
    }

    public void farvelBesked(){
        System.out.println("Tak for besøget hos Marios Pizza");
        System.exit(0);
    }
}
