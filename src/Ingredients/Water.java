package Ingredients;

public class Water implements Ingredient {
    @Override
    public String name() {
        return "Вода";
    }

    @Override
    public int cost() {
        return 10;
    }
}
