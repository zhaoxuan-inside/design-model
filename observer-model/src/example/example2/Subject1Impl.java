package example.example2;

import java.util.Observable;

@SuppressWarnings("unused")
public class Subject1Impl extends Observable {
    private int state = 0;

    public void setState(int state) {
        if (Math.abs(state - this.state) > 5) {
            super.setChanged();
            notifyObservers(state);
            this.state = state;
        }
    }
}
