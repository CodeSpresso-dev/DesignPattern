package behavioral.observer.communication.push;

public class SpreadSheet implements Observer {
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void update() {
        System.out.println("SpreadSheet got notified : " + dataSource.getValue());
    }
}
