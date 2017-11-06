package learn.hfpatterns.pizzashop;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "greek":
                pizza = new GreekPizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            default:
                throw new IllegalArgumentException("Unknown type of pizza: " + type);
        }


        return pizza;
    }
}
