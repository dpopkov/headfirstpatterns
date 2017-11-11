package learn.hfpatterns.weatherdata;

public class StatisticsDisplay extends AbstractDisplay {
    private double minTemp = 200.0;
    private double maxTemp = 0.0;
    private double tempSum = 0.0;
    private int numReadings = 0;

    public StatisticsDisplay(Subject weatherData) {
        super(weatherData);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
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

    @Override
    public void display() {
        double average = tempSum / numReadings;
        System.out.printf("Avg/Max/Min temperature = %.1f/%.1f/%.1f%n", average, maxTemp, minTemp);
    }
}
