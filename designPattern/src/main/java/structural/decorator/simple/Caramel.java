package structural.decorator.simple;

public class Caramel extends CoffeeDecorator {
    protected Caramel(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ",Caramel";
    }

    @Override
    public Double cost() {
        return coffee.cost() + 0.80;
    }
}
