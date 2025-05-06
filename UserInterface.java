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
        coffeeMachineStatus();
        userAction();


//        askForWater();
//        askForMilk();
//        askForCoffeeBeans();
//        askForNeededCoffee();
//        coffeeMakerAnswerToRequestedCoffee();
    }

//    private void askForWater() {
//        System.out.println("Write how many ml of water the coffee machine has:");
//        maker.setWaterStorage(validateIntegerUserInput());
//    }
//
//    public void askForMilk() {
//        System.out.println("Write how many ml of milk the coffee machine has:");
//        maker.setMilkStorage(validateIntegerUserInput());
//    }
//
//    public void askForCoffeeBeans() {
//        System.out.println("Write how many grams of coffee beans the coffee machine has:");
//        maker.setCoffeeBeansStorage(validateIntegerUserInput());
//    }

    public void coffeeMachineStatus() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water%n", maker.getWaterAmount());
        System.out.printf("%d ml of milk%n", maker.getMilkAmount());
        System.out.printf("%d g of coffee beans%n", maker.getCoffeeBeansAmount());
        System.out.printf("%d disposable cups%n", maker.getCups() );
        System.out.printf("$%d of money%n", maker.getBudget());
    }

    public void userAction() {
        System.out.println("Write action (buy, fill, take): ");
        String action = validateStringUserInput();
        switch(action) {
            case "buy":
                //TODO buy something
                break;
            case "fill":
                //TODO refill
                break;
            case "take":
                //TODO take money
                break;
        }
    }

    public void askForNeededCoffee() {
        System.out.println("Write how many cups of coffee you will need: ");
        maker.makeCups(validateIntegerUserInput());
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

    private int validateIntegerUserInput() {
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

    private String validateStringUserInput() {
        while (true) {
            String input = sc.nextLine();
            if(input.equals("buy")
            || input.equals("fill")
            || input.equals("take")) {
                return input;
            }
            System.out.println("Wrong input");
        }
    }
}
