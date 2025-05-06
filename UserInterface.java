package machine;
import java.sql.SQLOutput;
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
        coffeeMachineStatus();

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
                buyingCoffee();
                break;
            case "fill":
                //TODO refill
                break;
            case "take":
                //TODO take money
                break;
        }
    }

    public void buyingCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int input = validateIntegerUserInput(1,3);
        switch (input) {
            case 1:
                maker.makeEspresso();
                break;
            case 2:
                maker.makeLatte();
                break;
            case 3:
                maker.makeCappuccino();
                break;
        }
    }



    public void askForNeededCoffee() {
        System.out.println("Write how many cups of coffee you will need: ");
        maker.makeCups(validateIntegerUserInput(1,2));
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

    // validate user integer input, based on range (min value, max value) included

    private int validateIntegerUserInput(int minValue, int maxValue) {
        int input = 0;
        while(true) {
            try {
                input = Integer.parseInt(sc.nextLine());
                if(input >= minValue && input <= maxValue) {
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
