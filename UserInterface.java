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
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water%n", maker.getWaterAmount());
        System.out.printf("%d ml of milk%n", maker.getMilkAmount());
        System.out.printf("%d g of coffee beans%n", maker.getCoffeeBeansAmount());
        System.out.printf("%d disposable cups%n", maker.getCups() );
        System.out.printf("$%d of money%n", maker.getBudget());
        System.out.println();
    }

    // decide what to do based on user input

    public void userAction() {
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = validateStringUserInput();
            if (action.equals("exit")) {
                break;
            }
            if (maker.getCupsMade() > 0) {

                while (true) {
                    System.out.println("I need cleaning!");
                    action = validateStringUserInput();
                    if(action.equals("clean")){
                        clean();
                        break;
                    }
                }
            }
            switch(action) {
                case "buy":
                    buyingCoffee();
                    break;
                case "fill":
                    fill();
                    break;
                case "clan":
                    clean();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    coffeeMachineStatus();
                    break;
            }
        }

    }

    // buying coffee based on user choice

    public void buyingCoffee() {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String input = validateStringUserInput();

        switch (input) {
            case "1":
                maker.makeEspresso();
                break;
            case "2":
                maker.makeLatte();
                break;
            case "3":
                maker.makeCappuccino();
                break;
            case "back":
                break;
        }
    }

    // fill the machine with new ingredients

    public void fill() {
        System.out.println("Write how many ml of water you want to add: ");
        maker.setWaterStorage(maker.getWaterAmount() + validateIntegerUserInput(0, 10000));


        System.out.println("Write how many ml of milk you want to add: ");
        maker.setMilkStorage(maker.getMilkAmount() + validateIntegerUserInput(0, 10000));

        System.out.println("Write how many grams of coffee beans you want to add:");
        maker.setCoffeeBeansStorage(maker.getCoffeeBeansAmount() + validateIntegerUserInput(0, 10000));

        System.out.println("Write how many disposable cups you want to add: ");
        maker.setCups((maker.getCups() + validateIntegerUserInput(0, 10000)));
    }

    // withdrawal all money

    public void take() {
        System.out.printf("I gave you $%d%n", maker.getBudget());
        maker.setBudget(0);
        System.out.println();
    }

    // clean machine
    public void clean() {
        maker.resetCupsMade();
        System.out.println("I have been cleaned!");
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
            || input.equals("take")
            || input.equals("remaining")
            || input.equals("exit")
            || input.equals("clean")){
                return input;
            }
            if(input.equals("back")
            || input.equals("1")
            ||input.equals("2")
                    || input.equals("3")) {
                        return input;
            }
            System.out.println("Wrong input");
        }
    }
}
