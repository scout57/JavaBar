import Drinks.*;

import java.util.ArrayList;
import java.util.Collection;

public class Menu {
    private Collection<Drink> drinks;

    public Menu() {
        this.drinks = getDrinks();
    }

    private Collection<Drink> getDrinks() {
        Collection<Drink> drinks = new ArrayList<Drink>();

        drinks.add(new ButterScotch());
        drinks.add(new GinAndTonic());
        drinks.add(new BloodMary());
        drinks.add(new Americano());
        drinks.add(new Latte());

        return drinks;
    }

    public void show(){
        for (Drink drink : this.drinks) {
            System.out.println(drink);
        }
    }
}
