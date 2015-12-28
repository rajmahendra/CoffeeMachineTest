package my.coffeemachine;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import my.coffeemachine.types.Ingredient;

/**
 *
 * @author Rajmahendra Hegde
 */
public class Recipe {

    private final Map<Ingredient, Integer> recipe;
    private final BigDecimal cost;

    private Recipe(final Map<Ingredient, Integer> recipe, final BigDecimal cost) {
        this.recipe = recipe;
        this.cost = cost;
    }

    public static class Builder {

        Map<Ingredient, Integer> recipe = new HashMap<>();

        public Builder addIngredient(Ingredient item, int quantity) {
            recipe.put(item, quantity);
            return this;
        }

        public Builder addIngredient(Ingredient item) {
            recipe.put(item, 1);
            return this;
        }

        public Recipe build() {
            BigDecimal cost = BigDecimal.ZERO;
            recipe.forEach((item, quantity) -> {
                cost.add(item.getCost().multiply(BigDecimal.valueOf(quantity)));
            });
            return new Recipe(recipe, cost);
        }
    }
}
