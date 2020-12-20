package Drinks;

import Ingredients.Ingredient;
import Ingredients.TomateJuice;
import Ingredients.Vodka;

import java.util.ArrayList;
import java.util.Collection;

public class BloodMary extends Drink {


    @Override
    protected String getName() {
        return "Кровавая мэри";
    }

    @Override
    protected Collection<Ingredient> getIngredients() {
        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

        ingredients.add(new Vodka());
        ingredients.add(new TomateJuice());

        return ingredients;
    }


}
