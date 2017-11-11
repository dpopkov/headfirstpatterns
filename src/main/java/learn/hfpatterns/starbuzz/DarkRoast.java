package learn.hfpatterns.starbuzz;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        super("Dark Roast Coffee");
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
