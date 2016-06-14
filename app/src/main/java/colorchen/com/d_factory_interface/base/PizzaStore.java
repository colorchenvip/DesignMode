package colorchen.com.d_factory_interface.base;


/**
 * 披萨商店
 * Created by color on 16/6/13 18:10.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza ;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
