package structural.decorator.simple;

public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ",Sugar";
    }

    @Override
    public Double cost() {
        return coffee.cost() + 0.40;
    }
}
