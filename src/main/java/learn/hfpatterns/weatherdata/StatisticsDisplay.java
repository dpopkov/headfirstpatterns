package learn.hfpatterns.weatherdata;

import java.util.Observable;

public class StatisticsDisplay extends AbstractDisplay {
    private double minTemp = 200.0;
    private double maxTemp = 0.0;
    private double tempSum = 0.0;
    private int numReadings = 0;

    public StatisticsDisplay(Observable weatherData) {
        super(weatherData);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            double temp = weatherData.getTemperature();
            tempSum += temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }
            if (temp < minTemp) {
                minTemp = temp;
            }

            display();
        }
    }

    @Override
    public void display() {
        double average = tempSum / numReadings;
        System.out.printf("Avg/Max/Min temperature = %.1f/%.1f/%.1f%n", average, maxTemp, minTemp);
    }
}
