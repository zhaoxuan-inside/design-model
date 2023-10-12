package example.example2;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("unused")
public class Observer1Impl implements Observer {

    private final String name;
    private final Observable subject;

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("[" + name + "] state change.");
    }

    public Observer1Impl(Observable subject, String name) {
        this.name = name;
        this.subject = subject;
        subject.addObserver(this);
    }
}
