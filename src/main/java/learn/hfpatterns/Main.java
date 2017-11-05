package learn.hfpatterns;

import learn.hfpatterns.simuduck.Duck;
import learn.hfpatterns.simuduck.MallardDuck;
import learn.hfpatterns.simuduck.RedheadDuck;
import learn.hfpatterns.simuduck.RubberDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();

        mallard.display();
        mallard.quack();

        redhead.display();
        redhead.swim();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.quack();
        rubber.fly();
    }
}
