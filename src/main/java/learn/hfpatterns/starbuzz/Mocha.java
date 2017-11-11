package learn.hfpatterns.starbuzz;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage, "Mocha");
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
