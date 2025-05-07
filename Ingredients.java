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

    // check if there is enough ingredients for coffee, if not output needed resource
    // if there is enough resources, output empty string and decrease resources based on given value

    public String takeEspressoIngredients() {
        if (this.water < 250) {
            return "water";
        } else if (this.coffeeBeans < 16) {
            return "beans";
        } else if (this.cups == 0) {
            return "cups";
        } else {
            this.water -= 250;
            this.coffeeBeans -= 16;
            this.budget += 4;
            this.cups -= 1;
        }
        return "";
    }

    public String takeLatteIngredients() {
        if (this.water < 350) {
            return "water";
        } else if (this.milk < 75) {
            return "milk";
        } else if (this.coffeeBeans < 20) {
            return "beans";
        } else if (cups == 0) {
            return "cups";
        } else {
            this.water -= 350;
            this.milk -= 75;
            this.coffeeBeans -= 20;
            this.budget += 7;
            this.cups -= 1;
            return "";
        }

    }

    public String takeCappuccinoIngredients() {
        if (this.water < 200) {
            return "water";
        } else if(this.milk < 100) {
            return "milk";
        } else if(this.coffeeBeans < 12) {
            return "beans";
        } else if(this.cups == 0) {
            return "cups";
        } else {
            this.water -= 200;
            this.milk -= 100;
            this.coffeeBeans -= 12;
            this.budget += 6;
            this.cups -= 1;
            return "";
        }

    }
}
