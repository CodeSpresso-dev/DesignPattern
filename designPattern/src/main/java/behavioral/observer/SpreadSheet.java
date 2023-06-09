package behavioral.observer;

public class SpreadSheet implements Observer {
    public void update() {
        System.out.println("SpreadSheet got notified");
    }
}
