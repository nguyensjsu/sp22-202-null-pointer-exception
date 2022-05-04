package main.Observer;

import main.java.Interfaces.IObserver;
import main.java.Interfaces.ISubject;

public class ConcreteObserver implements IObserver{

    protected String observerState;
    protected ISubject subject;

    public ConcreteObserver(ISubject subject){
        this.subject = subject;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        
    }
    
}
