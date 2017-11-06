package learn.hfpatterns.simuduck;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak squeak squeak");
    }
}
