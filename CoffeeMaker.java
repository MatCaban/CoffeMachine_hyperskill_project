package machine;

public class CoffeeMaker {
    private int milkForOneCup;
    private int waterForOneCup;
    private int beansForOneCup;
    private Ingredients ingredients;

    public CoffeeMaker() {
        this.milkForOneCup = 200;
        this.waterForOneCup = 50;
        this.beansForOneCup = 15;
        this.ingredients = new Ingredients();
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
}
