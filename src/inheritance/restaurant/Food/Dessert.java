package inheritance.restaurant.Food;

import java.math.BigDecimal;

public class Dessert extends Food {
    public Dessert(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}
