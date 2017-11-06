package learn.hfpatterns.simuduck;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("\nI'm a Decoy duck. Don't shoot me.");
    }
}
