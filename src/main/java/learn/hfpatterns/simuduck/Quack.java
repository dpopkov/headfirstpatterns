package learn.hfpatterns.simuduck;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("quack quack quack");
    }
}
