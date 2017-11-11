package learn.hfpatterns.weatherdata;

import java.util.Observable;

public class CurrentConditionsDisplay extends AbstractDisplay {
    private double temperature;
    private double humidity;

    public CurrentConditionsDisplay(Observable weatherData) {
        super(weatherData);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature
            + "F degrees and " + humidity + "% humidity");
    }
}
