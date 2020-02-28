package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.CoffeeMaker;
import lab.assignment.afterrefactoring.Mocha;
import lab.assignment.afterrefactoring.Cappuccino;
import lab.assignment.afterrefactoring.Americano;

public class CoffeeClient {

    public static void main(String[] args) {
        CoffeeMaker starbuzz = new Mocha();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new Cappuccino();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new Americano();
        starbuzz.prepareCoffee();
    }

}