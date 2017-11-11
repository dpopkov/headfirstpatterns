package learn.hfpatterns.weatherdata;

import java.util.Observable;
import java.util.Observer;

public abstract class AbstractDisplay implements Observer, DisplayElement {
    protected Observable observable;

    public AbstractDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
}
