package learn.hfpatterns.pizzashop.ingredients;

public abstract class Ingredient {
    private String name;

    public Ingredient(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
