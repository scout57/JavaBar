package Ingredients;

public class Brandy implements Ingredient {
    @Override
    public String name() {
        return "Коньяк";
    }

    @Override
    public int cost() {
        return 40;
    }
}
