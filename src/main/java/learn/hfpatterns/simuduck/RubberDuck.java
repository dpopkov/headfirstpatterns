package learn.hfpatterns.simuduck;

public class RubberDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("squeak squeak squeak");
    }

    @Override
    public void display() {
        System.out.println("\nLooks like a RubberDuck");
    }
}
