package learn.hfpatterns.weatherdata;

public class ForeCastDisplay extends AbstractDisplay {
    private double lastTemperature;
    private double currentTemperature;

    public ForeCastDisplay(Subject weatherData) {
        super(weatherData);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        lastTemperature = currentTemperature;
        currentTemperature = temp;
        display();
    }

    @Override
    public void display() {
        if (lastTemperature < currentTemperature) {
            System.out.println("Improving weather on the way");
        } else if (lastTemperature > currentTemperature) {
            System.out.println("Watch out for cooler, rainy weather");
        } else {
            System.out.println("More of the same");
        }
    }
}
