package learn.hfpatterns.weatherdata;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public double getTemperature() {
        return 0.0;
    }

    public double getHumidity() {
        return 0.0;
    }

    public double getPressure() {
        return 0.0;
    }

    /**
     * This method is called whenever the weather
     * measurements have been updated.
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        double temp = getTemperature();
        double humidity = getHumidity();
        double pressure = getPressure();

        for(Observer observer : observers) {
            observer.update(temp, humidity, pressure);
        }
    }
}
