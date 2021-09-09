package no.noroff.nicholas.machines;

import no.noroff.nicholas.util.Maintainable;

public abstract class DrinksMachine implements Maintainable {
    protected String brand = "NONAME";
    protected Boolean power = false;
    protected int water = 0;
    protected double money = 0;
    protected Boolean running = false;

    public DrinksMachine() {
    }

    public DrinksMachine(String brand, Boolean power, int water) {
        this.brand = brand;
        this.power = power;
        this.water = water;
    }

    public void flipPowerSwitch(){
        power = !power;
        System.out.println("The machine is now: " + (power? "On" : "Off"));
    }

    public abstract void prepareBasicDrink();

    public abstract void prepareAdvancedDrink();

}
