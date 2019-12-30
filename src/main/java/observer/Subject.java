package observer;

public interface Subject {

    abstract void registerObserver(Observer observer);

    abstract void removeObserver(Observer observer);

    abstract void notifyObservers();

    abstract int getState();

    abstract void setState(int state);
}
