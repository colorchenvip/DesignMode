package colorchen.com.d_factory.bean;

import colorchen.com.d_factory.base.Pizza;

/**
 * Created by color on 16/6/13 18:44.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "纽约风格的沙司和奶酪为的披萨";
        dough = "薄饼";
        sauce = "大蒜番茄味的调味汁";

        toppings.add("高级干奶酪");
    }
}
