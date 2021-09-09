package no.noroff.nicholas.machines;

public class SlushyMachine extends DrinksMachine {

    // Constructors
    public SlushyMachine() {
    }

    public SlushyMachine(String brand, Boolean power, int water) {
        super(brand,power,water);
    }

    // Methods
    @Override
    public void prepareBasicDrink() {
        System.out.println("Preparing a slushy coffee");
        // Not catering for "not enough x" for demo purposes
        money += 30;
        running = true;
        water -= 250;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        running = false;
        System.out.println("Slushy done, enjoy your ice \n");
    }

    @Override
    public void prepareAdvancedDrink() {
        System.out.println("Preparing a fancy slushy!");
        money += 50;
        running = true;
        water -= 150;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Adding flavourtown");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        running = false;
        System.out.println("Slushy done, taste the rainbow \n");
    }

    @Override
    public String toString() {
        return "SlushyMachine{" +
                "brand='" + brand + '\'' +
                ", power=" + power +
                ", water=" + water +
                ", money=" + money +
                ", running=" + running +
                '}';
    }

    @Override
    public void topUp() {
        water = 1000;
    }

    @Override
    public void clean() {
        System.out.println("Hose it down");
    }
}
