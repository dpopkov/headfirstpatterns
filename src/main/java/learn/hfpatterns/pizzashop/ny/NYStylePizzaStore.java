package learn.hfpatterns.pizzashop.ny;

import learn.hfpatterns.pizzashop.Pizza;
import learn.hfpatterns.pizzashop.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "clam":
                pizza = new NYStyleClamPizza();
                break;
            case "pepperoni":
                pizza = new NYStylePepperoniPizza();
                break;
            case "veggie":
                pizza = new NYStyleVeggiePizza();
                break;
            default:
                throw new IllegalArgumentException("Unknown type of pizza: " + type);
        }

        return pizza;
    }
}
