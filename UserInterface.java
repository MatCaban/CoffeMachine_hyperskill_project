package machine;
import java.util.Scanner;

public class UserInterface {
    private Scanner sc;

    public UserInterface(Scanner sc) {
        this.sc = sc;
    }
    public void start() {
        printMessages();
    }

    private void printMessages() {
        System.out.println("""
                Starting to make a coffee
                Grinding coffee beans
                Boiling water
                Mixing boiled water with crushed coffee beans
                Pouring coffee into the cup
                Pouring some milk into the cup
                Coffee is ready!
                """);
    }
}
