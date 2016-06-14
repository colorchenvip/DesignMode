package colorchen.com.d_factory.factory;

import colorchen.com.d_factory.base.Pizza;
import colorchen.com.d_factory.bean.CheesePizza;
import colorchen.com.d_factory.bean.ClamPizza;
import colorchen.com.d_factory.bean.PepperoniPizza;
import colorchen.com.d_factory.bean.VeggiePizza;

/**
 * 简单的工厂方法
 * Created by color on 16/6/13 17:52.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }  else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }



}
