package Ingredients;

public class OrangeZest implements Ingredient {
    @Override
    public String name() {
        return "Цедра апельсина";
    }

    @Override
    public int cost() {
        return 5;
    }
}
