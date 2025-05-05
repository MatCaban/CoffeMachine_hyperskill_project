package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserInterface UI = new UserInterface(sc);
        UI.start();
    }
}