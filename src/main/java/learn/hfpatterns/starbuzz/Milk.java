package learn.hfpatterns.starbuzz;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage, "Milk");
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }
}
