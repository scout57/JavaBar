package Drinks;

import Ingredients.*;

import java.util.ArrayList;
import java.util.Collection;

public class Americano extends Drink {


    @Override
    protected String getName() {
        return "Американо";
    }

    @Override
    protected Collection<Ingredient> getIngredients() {
        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

        ingredients.add(new Water());
        ingredients.add(new Coffee());

        return ingredients;
    }


}
