package colorchen.com.d_factory.store;

import colorchen.com.d_factory.base.Pizza;
import colorchen.com.d_factory.base.PizzaStore;
import colorchen.com.d_factory.bean.ChicagoStyleCheesePizza;
import colorchen.com.d_factory.bean.ChicagoStyleVeggiePizza;

/**
 * Created by color on 16/6/13 18:33.
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if (type.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }else return null;
    }
}
