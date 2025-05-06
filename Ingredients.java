package machine;

public class Ingredients {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int budget;
    private int cups;



    public Ingredients(int water, int milk, int coffeeBeans, int budget, int cups) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.budget = budget;
        this.cups = cups;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }



    public int getWater() {
        return this.water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public void takeEspressoIngredients() {
        this.water -= 250;
        this.coffeeBeans -= 16;
        this.budget += 4;
        this.cups -= 1;
    }

    public void takeLatteIngredients() {
        this.water -= 350;
        this.milk -= 75;
        this.coffeeBeans -= 20;
        this.budget += 7;
        this.cups -= 1;
    }

    public void takeCappuccinoIngredients() {
        this.water -= 200;
        this.milk -= 100;
        this.coffeeBeans -= 12;
        this.budget += 6;
        this.cups -= 1;
    }
}
