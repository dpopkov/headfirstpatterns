package learn.hfpatterns.weatherdata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StatisticsDisplay extends AbstractDisplay {
    private List<Double> temperatures = new ArrayList<>();
    private double min;
    private double average;
    private double max;

    public StatisticsDisplay(Subject weatherData) {
        super(weatherData);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        temperatures.add(temp);
        Collections.sort(temperatures);
        calculateStats();
        display();
    }

    private void calculateStats() {
        min = temperatures.get(0);
        double sum = 0;
        for (double t : temperatures) {
            sum += t;
        }
        average = sum / temperatures.size();
        max = temperatures.get(temperatures.size() - 1);
    }

    @Override
    public void display() {
        System.out.printf("Avg/Max/Min temperature = %.1f/%.1f/%.1f%n", average, max, min);
    }
}
