package observer;

public class Main {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer obs1 = new ObserverOne(subject);
        Observer obs2 = new ObserverTwo(subject);
        subject.setState(1);
        subject.removeObserver(obs2);
        subject.setState(2);
        subject.removeObserver(obs1);
        subject.removeObserver(obs1);
        subject.setState(3);
        subject.registerObserver(obs1);
        subject.setState(4);
        subject.registerObserver(obs2);
        subject.registerObserver(obs2);
        subject.setState(5);
    }
}
