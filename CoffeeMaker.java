package machine;

public class CoffeeMaker {
    private int milkForOneCup;
    private int waterForOneCup;
    private int beansForOneCup;
    private Ingredients ingredientsStorage;

    public CoffeeMaker() {
        this.milkForOneCup = 200;
        this.waterForOneCup = 50;
        this.beansForOneCup = 15;
        this.ingredientsStorage = new Ingredients();
    }

    public int[] makeCups(int numOfCups){
        int[] ingredientsPerCup = {this.milkForOneCup, this.waterForOneCup, this.beansForOneCup};
        for (int i = 1; i < numOfCups; i++) {
            ingredientsPerCup[0] += this.milkForOneCup;
            ingredientsPerCup[1] += this.waterForOneCup;
            ingredientsPerCup[2] += this.beansForOneCup;
        }

        return ingredientsPerCup;
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
