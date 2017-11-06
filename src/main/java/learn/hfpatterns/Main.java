package learn.hfpatterns;

import learn.hfpatterns.simuduck.*;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();

        mallard.display();
        mallard.quack();

        redhead.display();
        redhead.swim();
        redhead.fly();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.quack();
        rubber.fly();

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.quack();
        decoy.fly();
    }
}
