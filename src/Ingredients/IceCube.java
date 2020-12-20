package Ingredients;

public class IceCube implements Ingredient {
    @Override
    public String name() {
        return "Кубики льда";
    }

    @Override
    public int cost() {
        return 2;
    }
}
