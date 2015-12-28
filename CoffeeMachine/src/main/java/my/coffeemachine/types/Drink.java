package my.coffeemachine.types;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.coffeemachine.Recipe;
import static my.coffeemachine.types.Ingredient.*;
/**
 *
 * @author Rajmahendra Hegde
 */
public enum Drink {

    CAFFE_AMERICANO("Caffè Americano", new Recipe.Builder().addIngredient( ESPRESSO,3).build()),
    CAFFE_LATTE("Caffè Latte", new Recipe.Builder().addIngredient( ESPRESSO,2).addIngredient( STEAMED_MILK,2).build()),
    CAFFE_MOCHA("Caffè Mocha", new Recipe.Builder().addIngredient(ESPRESSO).addIngredient(COCOA,2).addIngredient(STEAMED_MILK).addIngredient(WHIPPED_CREAM).build()),
    CAPPUCCINO("Cappuccino", new Recipe.Builder().addIngredient( ESPRESSO,2).addIngredient(STEAMED_MILK).addIngredient(FOAMED_MILK).build()),
    COFFEE("Coffee", new Recipe.Builder().addIngredient( Ingredient.COFFEE,3).addIngredient(SUGAR).addIngredient(CREAM).build()),
    DECAF_COFFEE("Decaf Coffee", new Recipe.Builder().addIngredient( Ingredient.DECAF_COFFEE,3).addIngredient(SUGAR).addIngredient(CREAM).build());

    private final String name;
    private final Map<Ingredient, Integer> ingredients;
    private final BigDecimal cost;

    Drink(String name, Recipe recipe) {
        Map<Ingredient, Integer> map = new HashMap<>();
        BigDecimal cost = BigDecimal.ZERO;

        this.name = name;
        this.ingredients = Collections.unmodifiableMap(map);
        this.cost = cost;
    }

    public Map<Ingredient, Integer> getRecipe() {
        return this.ingredients;
    }

    public BigDecimal getPrice() {
        return this.cost;
    }

    @Override
    public String toString() {
        return "Drink{" + "name=" + name + ", ingredients=" + ingredients + ", cost=" + cost + '}';
    }

}
