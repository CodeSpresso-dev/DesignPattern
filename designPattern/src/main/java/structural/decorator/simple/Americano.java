package structural.decorator.simple;

public class Americano implements Coffee {
    @Override
    public String getDescription() {
        return "Americano";
    }

    @Override
    public Double cost() {
        return 2.10;
    }
}
