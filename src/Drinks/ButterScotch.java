package Drinks;

import Ingredients.*;

import java.util.ArrayList;
import java.util.Collection;

public class ButterScotch extends Drink {


    @Override
    protected String getName() {
        return "Баттер скотч";
    }

    @Override
    protected Collection<Ingredient> getIngredients() {
        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

        ingredients.add(new Burbon());
        ingredients.add(new RedBitter());
        ingredients.add(new OrangeZest());
        ingredients.add(new IceCube());

        return ingredients;
    }


}
