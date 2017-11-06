package learn.hfpatterns.simuduck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("\nI'm a real Mallard duck");
    }
}
