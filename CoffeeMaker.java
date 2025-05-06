package machine;

public class CoffeeMaker {
    private int milkForOneCup;
    private int waterForOneCup;
    private int beansForOneCup;
    private Ingredients ingredientsStorage;
    private int[] totalIngredientsPerRequestedCups;

    public CoffeeMaker() {
        this.milkForOneCup = 200;
        this.waterForOneCup = 50;
        this.beansForOneCup = 15;
        this.ingredientsStorage = new Ingredients();
        this.totalIngredientsPerRequestedCups = new int[3];
    }

    public void makeCups(int numOfCups){
       this.totalIngredientsPerRequestedCups[0] *= numOfCups;
       this.totalIngredientsPerRequestedCups[1] *= numOfCups;
       this.totalIngredientsPerRequestedCups[2] *= numOfCups;



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
}
