package learn.hfpatterns.pizzashop.chicago;

import learn.hfpatterns.pizzashop.Pizza;
import learn.hfpatterns.pizzashop.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
            case "clam":
                pizza = new ChicagoStyleClamPizza();
                break;
            case "pepperoni":
                pizza = new ChicagoStylePepperonyPizza();
                break;
            case "veggie":
                pizza = new ChicagoStyleVeggiePizza();
                break;
            default:
                throw new IllegalArgumentException("Unknown type of pizza: " + type);
        }

        return pizza;
    }
}
