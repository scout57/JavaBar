package Ingredients;

public class Tonic implements Ingredient {
    @Override
    public String name() {
        return "Тоник";
    }

    @Override
    public int cost() {
        return 20;
    }
}
