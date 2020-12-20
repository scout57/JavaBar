package Ingredients;

public class Gin implements Ingredient {
    @Override
    public String name() {
        return "Джин";
    }

    @Override
    public int cost() {
        return 35;
    }
}
