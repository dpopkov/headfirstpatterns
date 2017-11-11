package learn.hfpatterns.weatherdata;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForeCastDisplay foreCastDisplay = new ForeCastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4);
        System.out.println();

        weatherData.setMeasurements(82, 70, 29.2);
        System.out.println();

        weatherData.setMeasurements(78, 90, 29.2);
        System.out.println();

        weatherData.setMeasurements(78, 90, 29.2);
        System.out.println();
    }
}
