package Drinks;

import Ingredients.Coffee;
import Ingredients.Ingredient;
import Ingredients.Milk;
import Ingredients.Water;

import java.util.ArrayList;
import java.util.Collection;

public class Latte extends Drink {


    @Override
    protected String getName() {
        return "Латте";
    }

    @Override
    protected Collection<Ingredient> getIngredients() {
        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

        ingredients.add(new Milk());
        ingredients.add(new Coffee());

        return ingredients;
    }


}
