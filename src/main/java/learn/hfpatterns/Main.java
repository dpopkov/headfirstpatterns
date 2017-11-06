package learn.hfpatterns;

import learn.hfpatterns.simuduck.*;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();

        mallard.display();
        mallard.performQuack();

        redhead.display();
        redhead.swim();
        redhead.performFly();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performQuack();
        rubber.performFly();

        DecoyDuck decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();
        decoy.performFly();
    }
}
