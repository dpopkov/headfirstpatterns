package learn.hfpatterns.simuduck;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("\nI'm a real Redhead duck.");
    }
}
