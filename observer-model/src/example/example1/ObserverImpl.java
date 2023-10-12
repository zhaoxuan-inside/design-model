package example.example1;

import java.util.concurrent.TimeUnit;

@SuppressWarnings("unused")
public class ObserverImpl implements Observer {

    private final String name;
    private final Subject subject;

    public ObserverImpl(Subject subject, String name) {
        this.name = name;
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(int state) {
        System.out.println(name + " receive state, new state : " + state);

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        subject.removeObserver(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
