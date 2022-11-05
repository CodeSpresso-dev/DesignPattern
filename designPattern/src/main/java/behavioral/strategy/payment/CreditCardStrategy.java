package behavioral.strategy.payment;

public class CreditCardStrategy implements PaymentStrategy  {
    private String name;
    private String cvv;
    private String cardNumber;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cvv, String cardNumber, String dateOfExpiry) {
        this.name = name;
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.dateOfExpiry = dateOfExpiry;
    }

    public void pay(double amount) {
        System.out.println(amount + "$ paid with credit/debit card");
    }
}
