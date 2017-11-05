package learn.hfpatterns;

import learn.hfpatterns.simuduck.Duck;
import learn.hfpatterns.simuduck.MallardDuck;
import learn.hfpatterns.simuduck.RedheadDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();

        mallard.quack();
        mallard.display();

        redhead.swim();
        redhead.display();
    }
}
