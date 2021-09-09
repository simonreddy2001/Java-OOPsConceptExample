package no.noroff.nicholas.machines;

public class CoffeeMachine extends DrinksMachine {
    // Fields
    private int milk = 0;
    private int beans = 0;


    // Constructors
    public CoffeeMachine() {
    }

    public CoffeeMachine(String brand, Boolean power, int water, int milk, int beans) {
        super(brand,power,water);
        this.milk = milk;
        this.beans = beans;
    }

    // Methods
    @Override
    public void prepareBasicDrink() {
        System.out.println("Preparing a basic coffee");
        // Not catering for "not enough x" for demo purposes
        money += 30;
        running = true;
        water -= 250;
        beans -= 50;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        running = false;
        System.out.println("Coffee done, watch your mouth \n");
    }

    @Override
    public void prepareAdvancedDrink() {
        System.out.println("Preparing a fancy coffee!");
        money += 50;
        running = true;
        water -= 150;
        beans -= 50;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Adding milk");
        milk -= 50;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        running = false;
        System.out.println("Coffee done, go flex on the haters \n");
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "power=" + power +
                ", water=" + water +
                ", milk=" + milk +
                ", beans=" + beans +
                ", money=" + money +
                ", running=" + running +
                '}';
    }

    @Override
    public void topUp() {
        water = 1000;
        beans = 500;
        milk = 250;
        System.out.println("Machine topped up");
    }

    @Override
    public void clean() {
        System.out.println("Descaling");
    }
}
