package Ingredients;

public class Lemon implements Ingredient {
    @Override
    public String name() {
        return "Лимон";
    }

    @Override
    public int cost() {
        return 5;
    }
}
