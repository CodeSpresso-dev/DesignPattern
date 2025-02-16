package structural.decorator.simple;

public class Espresso implements Coffee {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public Double cost() {
        return 1.90;
    }
}
