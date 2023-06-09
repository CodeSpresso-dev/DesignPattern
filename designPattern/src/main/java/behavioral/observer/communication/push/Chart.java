package behavioral.observer.communication.push;

public class Chart implements Observer {
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void update() {
        System.out.println("chart got updated : " + dataSource.getValue());
    }
}
