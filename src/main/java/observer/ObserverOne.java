package observer;

public class ObserverOne implements Observer {

    protected Subject subject;

    public ObserverOne(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Observer 1. Updated state: " + this.subject.getState());
    }

}
