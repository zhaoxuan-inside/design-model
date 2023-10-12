package example.example1;

@SuppressWarnings("unused")
public class ObserverModelTest {
    public static void main(String[] args) {
        Subject subject = new SubjectImpl();

        ObserverImpl observer1 = new ObserverImpl(subject, "observer1");
        ObserverImpl observer2 = new ObserverImpl(subject, "observer2");
        ObserverImpl observer3 = new ObserverImpl(subject, "observer3");

        subject.setState(10086);

    }
}
