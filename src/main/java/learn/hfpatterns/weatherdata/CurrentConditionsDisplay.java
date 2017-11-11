package learn.hfpatterns.weatherdata;

public class CurrentConditionsDisplay extends AbstractDisplay {
    private double temperature;
    private double humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        super(weatherData);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temperature
            + "F degrees and " + humidity + "% humidity");
    }
}
