package no.noroff.nicholas;

import no.noroff.nicholas.machines.CoffeeMachine;
import no.noroff.nicholas.machines.DrinksMachine;
import no.noroff.nicholas.machines.SlushyMachine;
import no.noroff.nicholas.util.Maintainable;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Drinks
        ArrayList<DrinksMachine> machines = new ArrayList<>();
        ArrayList<Maintainable> maintainables = new ArrayList<>();

	    // Coffee machine
        CoffeeMachine machine2 = new CoffeeMachine(
                "Wake me up inside",true,1000,250,500);
        machines.add(machine2);
        maintainables.add(machine2);
        // Slushy
        SlushyMachine slush = new SlushyMachine("Slush Master 9001",true,5000);
        machines.add(slush);
        maintainables.add(slush);

        for (DrinksMachine drank: machines) {
            System.out.println(drank.toString());
            drank.prepareBasicDrink();
            drank.prepareAdvancedDrink();
        }

        for (Maintainable machine: maintainables) {
            machine.topUp();
            machine.clean();
        }

    }
}
