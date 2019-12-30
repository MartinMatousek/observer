package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
            System.out.println(observer.toString() + " registered to ConcreteSubject");
        } else {
            System.out.println(observer.toString() + " has already been registered for this Subject.");
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
            System.out.println(observer.toString() + " removed from ConcreteSubject");
        } else {
            System.out.println(observer.toString() + " has not been registered for this Subject.");
        }
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying observers.");
        for (int i = 0; i < observers.size(); i++) {
            System.out.println(observers.get(i).toString() + " notified");
            observers.get(i).update();
        }
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
}
