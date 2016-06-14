package colorchen.com.d_factory.bean;

import colorchen.com.d_factory.base.Pizza;

/**
 * Created by color on 16/6/13 18:44.
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "纽约风格的Veggie";
        dough = "薄饼";
        sauce = "大蒜番茄味的调味汁";

        toppings.add("高级0--Veggie");
    }
}
