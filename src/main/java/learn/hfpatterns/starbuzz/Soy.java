package learn.hfpatterns.starbuzz;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage, "Soy");
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
