package Ingredients;

public class TomateJuice implements Ingredient {
    @Override
    public String name() {
        return "Томатный сок";
    }

    @Override
    public int cost() {
        return 15;
    }
}
