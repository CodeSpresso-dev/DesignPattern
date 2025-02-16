package structural.decorator.simple;

public class DecoratorDemo {
    public static void main(String[] args) {
        Coffee americano = new Americano();
        americano = new Sugar(americano);
        americano = new Milk(americano);

        System.out.println(americano.cost());
        System.out.println(americano.getDescription());
    }

}
