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
        this.ingredientsStorage = new Ingredients();
        this.totalIngredientsPerRequestedCups = new int[3];
    }

    public void makeCups(int numOfCups){
       this.totalIngredientsPerRequestedCups[0] = numOfCups * this.waterForOneCup;
       this.totalIngredientsPerRequestedCups[1] = numOfCups * this.milkForOneCup;
       this.totalIngredientsPerRequestedCups[2] = numOfCups * this.beansForOneCup;

        System.out.println(Arrays.toString(totalIngredientsPerRequestedCups));

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

    // number of coffee cups I can make based on ingredients in storage

    public int howManyCupsCanIMake() {
        int totalCupsAvailable = this.ingredientsStorage.getWater() / this.waterForOneCup;
        if (totalCupsAvailable > this.ingredientsStorage.getMilk() / this.milkForOneCup) {
            totalCupsAvailable = this.ingredientsStorage.getMilk() / this.milkForOneCup;
        } else if (totalCupsAvailable > this.ingredientsStorage.getCoffeeBeans() / this.beansForOneCup){
            totalCupsAvailable = this.ingredientsStorage.getCoffeeBeans() / this.beansForOneCup;
        }

        return totalCupsAvailable;
    }

    public int cupsRequested() {
        return this.totalIngredientsPerRequestedCups[0] / 200;
    }
}
