
package my.coffeemachine.types;

import java.math.BigDecimal;

/**
 *
 * @author Rajmahendra Hegde
 */
public enum Ingredient {

    COCOA("Coco", "0.90"),
    COFFEE("Coffee", "0.75"),
    CREAM("Cream", "0.25"),
    DECAF_COFFEE("Decaf Coffee", "0.75"),
    ESPRESSO("Espresso", "1.10"),
    FOAMED_MILK("Foamed Milk", "0.35"),
    STEAMED_MILK("Steamed Milk", "0.35"),
    SUGAR("Sugar", "0.25"),
    WHIPPED_CREAM("Whipped Cream", "1.00"),
    WATER("Water","0.0");

    private final String name;
    private final BigDecimal cost;

    Ingredient(String name, String cost) {
        this.name = name;
        this.cost = new BigDecimal(cost);
    }

    public BigDecimal getCost() {
        return this.cost;
    }

    @Override
    public String toString() {
        return "Ingredient{" + "name=" + name + ", cost=" + cost + '}';
    }
 
    
}
