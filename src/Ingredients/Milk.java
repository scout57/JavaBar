package Ingredients;

public class Milk implements Ingredient {
    @Override
    public String name() {
        return "Молоко";
    }

    @Override
    public int cost() {
        return 15;
    }
}
