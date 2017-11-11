package learn.hfpatterns.weatherdata;

public abstract class AbstractDisplay implements Observer, DisplayElement {
    protected Subject weatherData;

    public AbstractDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
}
