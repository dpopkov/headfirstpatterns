package learn.hfpatterns.simuduck;

public class RedheadDuck extends Duck implements Quackable, Flyable {
    public void quack() {
        System.out.println("quack quack quack");
    }

    public void display() {
        System.out.println("\nThis duck looks like a RedheadDuck");
    }

    public void fly() {
        System.out.println("RedheadDuck is flying");
    }
}
