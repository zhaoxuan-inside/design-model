package example.example1;

@SuppressWarnings("unused")
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

    void setState(int newState);

    int getState();
}
