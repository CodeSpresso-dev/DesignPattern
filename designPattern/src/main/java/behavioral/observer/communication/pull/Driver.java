package behavioral.observer.communication.pull;

public class Driver {
    public static void main(String[] args) {
        Chart chart = new Chart();
        Chart chart1 = new Chart();
        SpreadSheet spreadSheet = new SpreadSheet();

        DataSource dataSource = new DataSource();
        dataSource.addObserver(chart);
        dataSource.addObserver(chart1);
        dataSource.addObserver(spreadSheet);

        dataSource.setValue(10);
    }
}
