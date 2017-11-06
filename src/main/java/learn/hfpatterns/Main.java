package learn.hfpatterns;

import learn.hfpatterns.simuduck.*;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        RedheadDuck redhead = new RedheadDuck();

        mallard.display();
        mallard.quack();

        redhead.display();
        redhead.swim();
        redhead.fly();

        RubberDuck rubber = new RubberDuck();
        rubber.display();
        rubber.quack();

        DecoyDuck decoy = new DecoyDuck();
        decoy.display();
    }
}
