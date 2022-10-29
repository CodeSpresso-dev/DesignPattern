package behavioral.strategy.payment;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new Item(12.5, "Item1");
        Item item2 = new Item(245.6, "Item2");

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        PaypalStrategy paypalStrategy = new PaypalStrategy("test@paypal.com", "test");
        shoppingCart.pay(paypalStrategy);
    }
}
