package structural.decorator.mix;

import structural.decorator.mix.type.CoffeeType;
import structural.decorator.simple.Coffee;
import structural.decorator.simple.Milk;
import structural.decorator.simple.Sugar;

public class CoffeeBuilder {
    private Coffee coffee;
    private boolean wantsSugar = false;
    private boolean wantsMilk = false;

    public CoffeeBuilder(CoffeeType coffeeType) {
        this.coffee = CoffeeFactory.getCoffee(coffeeType);
    }
    public CoffeeBuilder addSugar() {
        this.wantsSugar = true;
        return this;
    }
    public CoffeeBuilder addMilk() {
        this.wantsMilk = true;
        return this;
    }

    public Coffee build() {
        if (wantsSugar) {
            coffee = new Sugar(coffee);
        }
        if (wantsMilk) {
            coffee = new Milk(coffee);
        }
        return coffee;
    }
}
