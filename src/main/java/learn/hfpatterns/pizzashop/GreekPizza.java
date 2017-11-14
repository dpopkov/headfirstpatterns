package learn.hfpatterns.pizzashop;

import learn.hfpatterns.pizzashop.ingredients.PizzaIngredientFactory;

public class GreekPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public GreekPizza(PizzaIngredientFactory ingredientFactory) {
        super("Greek Pizza");
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare " + getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
