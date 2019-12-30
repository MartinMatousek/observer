package observer;

public class ObserverTwo implements Observer {
    
    protected Subject subject;
    public ObserverTwo(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }
    @Override
    public void update() {
        System.out.println("Observer 2. Updated state: " + this.subject.getState());
    }
    
}
