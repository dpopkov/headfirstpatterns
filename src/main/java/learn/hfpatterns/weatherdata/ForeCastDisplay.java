package learn.hfpatterns.weatherdata;

public class ForeCastDisplay extends AbstractDisplay {
    private double currentPressure = 29.92f;
    private double lastPressure;

    public ForeCastDisplay(Subject weatherData) {
        super(weatherData);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
