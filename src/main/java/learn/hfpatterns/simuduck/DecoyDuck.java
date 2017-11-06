package learn.hfpatterns.simuduck;

public class DecoyDuck extends Duck {
    @Override
    public void quack() {
        // do nothing
    }

    @Override
    public void display() {
        System.out.println("\nThis duck looks like DecoyDuck");
    }

    @Override
    public void fly() {
        // do nothing
    }
}
