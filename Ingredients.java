package machine;

public class Ingredients {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int budget;
    private int cups;

    // initialized values based on project request

    public Ingredients() {
        this.water = 400;
        this.milk = 540;
        this.coffeeBeans = 120;
        this.budget = 550;
        this.cups = 9;
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
