package behavioral.observer.communication.pull;

public class SpreadSheet implements Observer {
    public void update(int value) {
        System.out.println("SpreadSheet got notified : " + value);
    }
}
