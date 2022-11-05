package behavioral.strategy.payment;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart  {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotalPrice() {
        double sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }
    public void pay(PaymentStrategy strategy){
        strategy.pay(calculateTotalPrice());
    }
}
