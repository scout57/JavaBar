package Ingredients;

public class Burbon implements Ingredient {
    @Override
    public String name() {
        return "Домашний бурбон";
    }

    @Override
    public int cost() {
        return 40;
    }
}
