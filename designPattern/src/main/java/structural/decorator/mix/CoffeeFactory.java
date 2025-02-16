package structural.decorator.mix;

import structural.decorator.mix.type.CoffeeType;
import structural.decorator.simple.Americano;
import structural.decorator.simple.Coffee;
import structural.decorator.simple.Espresso;

public class CoffeeFactory {
    public static Coffee getCoffee(CoffeeType coffeeType){
        return switch (coffeeType) {
            case ESPRESSO -> new Espresso();
            case AMERICANO -> new Americano();
        };
    }
}
