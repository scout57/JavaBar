package Drinks;

import Ingredients.Ingredient;

import java.util.Collection;

abstract public class Drink {

    private Collection<Ingredient> ingredients;
    private String name;

    protected Drink() {
        this.ingredients = getIngredients();
        this.name = getName();
    }

    abstract protected String getName();

    abstract protected Collection<Ingredient> getIngredients();


    final public int total() {
        int sum = 0;

        for (Ingredient ingredient : this.ingredients) {
            sum += ingredient.cost();
        }

        return sum;
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();

        buffer.append("------------" + "\n");
        buffer.append("-- " + this.name + "\n");
        buffer.append("------------" + "\n");
        buffer.append("-- Состав: " + "\n");

        for (Ingredient ingredient : this.ingredients) {

            buffer.append("-- " + ingredient.name() + ": " + ingredient.cost() + " руб." + "\n");

        }
        buffer.append("------------" + "\n");
        buffer.append("-- Итого: " + this.total() + " рублей" + "\n");
        buffer.append("------------" + "\n");
        buffer.append("\n");

        return buffer.toString();
    }
}
