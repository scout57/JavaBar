package Drinks;

import Ingredients.*;

import java.util.ArrayList;
import java.util.Collection;

public class GinAndTonic extends Drink {


    @Override
    protected String getName() {
        return "Баттер скотч";
    }

    @Override
    protected Collection<Ingredient> getIngredients() {
        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

        ingredients.add(new Gin());
        ingredients.add(new Tonic());
        ingredients.add(new Lemon());
        ingredients.add(new IceCube());

        return ingredients;
    }


}
