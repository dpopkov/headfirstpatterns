package learn.hfpatterns.pizzashop;

import learn.hfpatterns.pizzashop.ingredients.*;

public class VeggiePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        super("Veggie Pizza");
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Prepare " + getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = new Veggies[] {new EggPlant(), new Garlic(), new Spinach()};
    }
}
