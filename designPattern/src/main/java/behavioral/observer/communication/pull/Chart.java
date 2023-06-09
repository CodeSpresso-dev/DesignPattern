package behavioral.observer.communication.pull;

public class Chart implements Observer {
    public void update(int value) {
        System.out.println("chart got updated :" + value);
    }
}
