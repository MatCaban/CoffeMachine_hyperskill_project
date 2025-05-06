package machine;

import java.util.Arrays;

public class CoffeeMaker {
    final private int milkForOneCup;
    final private int waterForOneCup;
    final private int beansForOneCup;
    final private Ingredients ingredientsStorage;
    private int[] totalIngredientsPerRequestedCups;

    public CoffeeMaker() {
        this.milkForOneCup = 50;
        this.waterForOneCup = 200;
        this.beansForOneCup = 15;

        //setting based on project requirements
        this.ingredientsStorage = new Ingredients(400, 540, 120, 550, 9);
        this.totalIngredientsPerRequestedCups = new int[3];
    }

    // count how much ingredients is needed for number of cups requested by user

    public void makeCups(int numOfCups) {
        this.totalIngredientsPerRequestedCups[0] = numOfCups * this.waterForOneCup;
        this.totalIngredientsPerRequestedCups[1] = numOfCups * this.milkForOneCup;
        this.totalIngredientsPerRequestedCups[2] = numOfCups * this.beansForOneCup;

    }

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

    public void makeEspresso() {
        this.ingredientsStorage.takeEspressoIngredients();
    }

    public void makeLatte() {
        this.ingredientsStorage.takeLatteIngredients();
    }

    public void makeCappuccino() {
        this.ingredientsStorage.takeCappuccinoIngredients();
    }


    // number of coffee cups I can make based on ingredients in storage

    public int howManyCupsCanIMake() {
        int totalCupsAvailable = this.ingredientsStorage.getWater() / this.waterForOneCup;
        if (totalCupsAvailable > this.ingredientsStorage.getMilk() / this.milkForOneCup) {
            totalCupsAvailable = this.ingredientsStorage.getMilk() / this.milkForOneCup;
        } else if (totalCupsAvailable > this.ingredientsStorage.getCoffeeBeans() / this.beansForOneCup) {
            totalCupsAvailable = this.ingredientsStorage.getCoffeeBeans() / this.beansForOneCup;
        }

        return totalCupsAvailable;
    }

    public int cupsRequested() {
        return this.totalIngredientsPerRequestedCups[0] / 200;
    }
}
