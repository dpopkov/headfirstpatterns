package learn.hfpatterns.simuduck;

public abstract class Duck {
    public void quack() {
        System.out.println("quack quack quack");
    }

    public void swim() {
        System.out.println("This duck is swimming");
    }

    public abstract void display();

    public void fly() {
        System.out.println("This duck is flying like all Ducks");
    }
}
