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
        askForWater();
        askForMilk();
        askForCoffeeBeans();
        askForNeededCoffee();
        coffeeMakerAnswerToRequestedCoffee();
    }

    private void askForWater() {
        System.out.println("Write how many ml of water the coffee machine has:");
        maker.setWaterStorage(validateUserInput());
    }

    public void askForMilk() {
        System.out.println("Write how many ml of milk the coffee machine has:");
        maker.setMilkStorage(validateUserInput());
    }

    public void askForCoffeeBeans() {
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        maker.setCoffeeBeansStorage(validateUserInput());
    }

    public void askForNeededCoffee() {
        System.out.println("Write how many cups of coffee you will need: ");
        maker.makeCups(validateUserInput());
    }


    public void coffeeMakerAnswerToRequestedCoffee() {
        int cupsRequested = maker.cupsRequested();
        int cupsAvailable = maker.howManyCupsCanIMake();
        if (cupsAvailable == cupsRequested) {
            System.out.println("Yes, I can make that amount of coffee");
        }
        if (cupsAvailable > cupsRequested) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)%n"
                    , (cupsAvailable - cupsRequested));
        }
        if (cupsAvailable < cupsRequested) {
            System.out.printf("No, I can make only %d cup(s) of coffee", cupsAvailable);
        }
    }

    private int validateUserInput() {
        int input = 0;
        while(true) {
            try {
                input = Integer.parseInt(sc.nextLine());
                if(input >= 0) {
                    return input;
                }
                System.out.println("Invalid input, only numeric values greater than 0");
            } catch (Exception e) {
                System.out.println("Invalid input, only numeric values greater than 0");
            }
        }
    }
}
