package colorchen.com.d_factory.bean;

import colorchen.com.d_factory.base.Pizza;

/**
 * Created by color on 16/6/13 18:50.
 */
public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "芝加哥VeggiePizza";
        dough = "中等饼";
        sauce = "小番茄为";

        toppings.add("白奶酪VeggiePizza");
    }

    @Override
    public void cut() {
        System.out.println("切成大块");
    }
}
