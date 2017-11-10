package learn.hfpatterns.weatherdata;

public interface Observer {
    void update(double temp, double humidity, double pressure);
}
