package behavioral.observer.communication.push;

public class Driver {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();

        Chart chart = new Chart(dataSource);
        Chart chart1 = new Chart(dataSource);
        SpreadSheet spreadSheet = new SpreadSheet(dataSource);

        dataSource.addObserver(chart);
        dataSource.addObserver(chart1);
        dataSource.addObserver(spreadSheet);

        dataSource.setValue(10);
    }
}
