package learn.hfpatterns.weatherdata;

public class WeatherData {
    private CurrentConditionsDisplay currentConditionsDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForeCastDisplay foreCastDisplay;

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
        double temp = getTemperature();
        double humidity = getHumidity();
        double pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        foreCastDisplay.update(temp, humidity, pressure);
    }
}
