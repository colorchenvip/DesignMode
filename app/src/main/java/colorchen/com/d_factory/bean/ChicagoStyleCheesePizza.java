package colorchen.com.d_factory.bean;

import colorchen.com.d_factory.base.Pizza;

/**
 * Created by color on 16/6/13 18:50.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "芝加哥CheesePizza";
        dough = "中等饼";
        sauce = "小番茄为";

        toppings.add("color奶酪CheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("切成ding ding");
    }

    @Override
    public void bake() {
        System.out.println("烘烤5分钟就好");
    }
}
