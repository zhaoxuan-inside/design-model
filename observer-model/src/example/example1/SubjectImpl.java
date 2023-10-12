package example.example1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@SuppressWarnings("unused")
public class SubjectImpl implements Subject {

    private int state = 0;

    private final Map<String, Observer> observerMap = new ConcurrentHashMap<>();

    @Override
    public void registerObserver(Observer observer) {
        observerMap.put(String.valueOf(observer.hashCode()), observer);
        System.out.println(observer.getName() + " registered.");
    }

    @Override
    public void removeObserver(Observer observer) {
        observerMap.remove(String.valueOf(observer.hashCode()));
        System.out.println(observer.getName() + " leaved.");
    }

    @Override
    public void notifyObservers() {
        observerMap.values().forEach(observer -> observer.update(state));
    }

    @Override
    public void setState(int newState) {
        this.state = newState;
        notifyObservers();
    }

    @Override
    public int getState() {
        return state;
    }

}
