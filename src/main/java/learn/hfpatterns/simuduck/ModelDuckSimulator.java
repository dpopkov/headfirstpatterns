package learn.hfpatterns.simuduck;

public class ModelDuckSimulator {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
