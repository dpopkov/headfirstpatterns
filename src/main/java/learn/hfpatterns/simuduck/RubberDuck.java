package learn.hfpatterns.simuduck;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("\nI'm just a Rubber duck. Children like to play with me.");
    }
}
