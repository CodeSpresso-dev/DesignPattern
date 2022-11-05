package behavioral.strategy.payment;

public class Item {
    private double price;
    private String itemCode;

    public Item(double price,String itemCode)  {
        this.price = price;
        this.itemCode = itemCode;
    }

    public double getPrice() {
        return price;
    }

    public String getItemCode() {
        return itemCode;
    }
}
