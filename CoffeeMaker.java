package machine;

import java.util.Arrays;

public class CoffeeMaker {
    final private Ingredients ingredientsStorage;
    private int cupsMade;

    public CoffeeMaker() {
        this.cupsMade = 0;

        //setting based on project requirements, machine strats with this amount of ingredients
        this.ingredientsStorage = new Ingredients(400, 540, 120, 550, 9);

    }

    public int getCupsMade() {
        return this.cupsMade;
    }

    public void increaseCupsMade() {
        this.cupsMade += 1;
    }

    public void resetCupsMade() {
        this.cupsMade = 0;
    }

    // setters and getters for ingredients from ingredients class

    public void setWaterStorage(int amountOfWater) {
        this.ingredientsStorage.setWater(amountOfWater);
    }

    public void setMilkStorage(int amountOfMilk) {
        this.ingredientsStorage.setMilk(amountOfMilk);
    }

    public void setCoffeeBeansStorage(int amountOfCoffeeBeans) {
        this.ingredientsStorage.setCoffeeBeans(amountOfCoffeeBeans);
    }

    public void setBudget(int budget) {
        this.ingredientsStorage.setBudget(budget);
    }

    public void setCups(int cups) {
        this.ingredientsStorage.setCups(cups);
    }

    public int getWaterAmount() {
        return this.ingredientsStorage.getWater();
    }

    public int getMilkAmount() {
        return this.ingredientsStorage.getMilk();
    }

    public int getCoffeeBeansAmount() {
        return this.ingredientsStorage.getCoffeeBeans();
    }

    public int getBudget() {
        return this.ingredientsStorage.getBudget();
    }

    public int getCups() {
        return this.ingredientsStorage.getCups();
    }


    // if Ingredients method return empty string there is enough resources to make coffee
    // otherwise string will contain ingredients that is in short supply

    public void makeEspresso() {
        if(this.ingredientsStorage.takeEspressoIngredients().isEmpty()){
            System.out.println("I have enough resources, making you a coffee!");
            increaseCupsMade();
        } else {
            System.out.printf("Sorry, not enough %s!%n", this.ingredientsStorage.takeEspressoIngredients());
        }
    }

    public void makeLatte() {
        if (this.ingredientsStorage.takeLatteIngredients().isEmpty()){
            System.out.println("I have enough resources, making you a coffee!");
            increaseCupsMade();
        } else {
            System.out.printf("Sorry, not enough %s!%n", this.ingredientsStorage.takeEspressoIngredients());
        }
    }

    public void makeCappuccino() {
        if (this.ingredientsStorage.takeCappuccinoIngredients().isEmpty()){
            System.out.println("I have enough resources, making you a coffee!");
            increaseCupsMade();
        } else {
            System.out.printf("Sorry, not enough %s!%n", this.ingredientsStorage.takeCappuccinoIngredients());
        }
    }

}
