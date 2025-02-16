package structural.decorator.mix;

import structural.decorator.mix.type.CoffeeType;
import structural.decorator.simple.Coffee;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee myCoffee = new CoffeeBuilder(CoffeeType.AMERICANO).addSugar().addMilk().build();
        System.out.println(myCoffee.getDescription());
        System.out.println(myCoffee.cost());
    }
}
