package machine;
import java.util.Scanner;

public class UserInterface {
    private Scanner sc;
    private CoffeeMaker maker;

    public UserInterface(Scanner sc) {
        this.sc = sc;
        this.maker = new CoffeeMaker();
    }
    public void start() {
        askForCups();
    }

    private void askForCups() {
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = Integer.parseInt(sc.nextLine());
        int[] ingredientsForCups = maker.makeCups(cups);
        System.out.printf("For %d cups of coffee you will need: %n", cups);
        System.out.printf("%d ml of water%n", ingredientsForCups[0]);
        System.out.printf("%d ml of milk%n", ingredientsForCups[1]);
        System.out.printf("%d g of coffee beans%n", ingredientsForCups[2]);
    }
}
