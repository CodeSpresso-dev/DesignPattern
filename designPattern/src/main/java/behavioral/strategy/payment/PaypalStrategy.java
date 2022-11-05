package behavioral.strategy.payment;

public class PaypalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    public void pay(double amount) {
        System.out.println(amount + "$ paid with Paypal.");
    }
}
