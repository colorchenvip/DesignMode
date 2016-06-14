package colorchen.com.d_factory.store;

import colorchen.com.d_factory.base.Pizza;
import colorchen.com.d_factory.base.PizzaStore;
import colorchen.com.d_factory.bean.NYStyleCheesePizza;
import colorchen.com.d_factory.bean.NYStyleVeggiePizza;

/**
 * Created by color on 16/6/13 18:28.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if (type.equals("veggie")){
            return new NYStyleVeggiePizza();
        }else return null;
    }
}
