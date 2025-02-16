package structural.decorator.simple;

public class Milk extends CoffeeDecorator {

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() +  ", Milk";
    }

    @Override
    public Double cost() {
        return coffee.cost() + .50;
    }
}
