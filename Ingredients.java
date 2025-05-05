package machine;

public class Ingredients {
    private int water;
    private int milk;
    private int coffeeBeans;

    public Ingredients(int water, int milk, int coffeeBeans) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
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




}
