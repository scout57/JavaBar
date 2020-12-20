package Ingredients;

public class RedBitter implements Ingredient {
    @Override
    public String name() {
        return "Красный биттер";
    }

    @Override
    public int cost() {
        return 25;
    }
}
