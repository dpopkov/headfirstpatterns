package learn.hfpatterns.pizzashop;

public class Shop {
    public Pizza orderPizza(String type) {
        Pizza pizza;

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

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
