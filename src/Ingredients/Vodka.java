package Ingredients;

public class Vodka implements Ingredient {
    @Override
    public String name() {
        return "Водка";
    }

    @Override
    public int cost() {
        return 35;
    }
}
