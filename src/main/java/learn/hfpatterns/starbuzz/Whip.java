package learn.hfpatterns.starbuzz;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage, "Whip");
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
