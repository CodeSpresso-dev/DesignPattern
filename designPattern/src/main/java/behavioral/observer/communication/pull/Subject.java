package behavioral.observer.communication.pull;

import java.util.ArrayList;
import java.util.List;

//Observable
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(int value) {
        for (Observer observer : observers
        ) {
            observer.update(value);
        }
    }
}
