package learn.hfpatterns.simuduck;

public class MallardDuck extends Duck implements Quackable, Flyable {
    public void quack() {
        System.out.println("quack quack quack");
    }

    public void display() {
        System.out.println("\nThis duck looks like a MallardDuck");
    }

    public void fly() {
        System.out.println("MallardDuck is flying");
    }
}
