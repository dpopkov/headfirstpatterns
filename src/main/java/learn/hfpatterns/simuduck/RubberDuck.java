package learn.hfpatterns.simuduck;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("\nLooks like a RubberDuck");
    }

    @Override
    public void fly() {
        // do nothing
    }
}
