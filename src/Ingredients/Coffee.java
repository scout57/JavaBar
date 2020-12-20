package Ingredients;

public class Coffee implements Ingredient {
    @Override
    public String name() {
        return "Кофе";
    }

    @Override
    public int cost() {
        return 25;
    }
}
