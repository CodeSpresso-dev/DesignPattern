package behavioral.observer;

public class Chart implements Observer{
    public void update() {
        System.out.println("chart got updated");
    }
}
