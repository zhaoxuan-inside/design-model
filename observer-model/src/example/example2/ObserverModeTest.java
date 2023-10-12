package example.example2;

import java.util.Observer;

@SuppressWarnings("unused")
public class ObserverModeTest {
    public static void main(String[] args) {
        Subject1Impl subject = new Subject1Impl();

        Observer observer1 = new Observer1Impl(subject, "observer1");
        Observer observer2 = new Observer1Impl(subject, "observer2");
        Observer observer3 = new Observer1Impl(subject, "observer3");

        subject.setState(10);
        subject.notifyObservers();

    }
}
