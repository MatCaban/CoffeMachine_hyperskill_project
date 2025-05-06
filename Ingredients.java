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
        this.water += water;
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
}
