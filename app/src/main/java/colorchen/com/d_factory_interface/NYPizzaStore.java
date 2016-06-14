package colorchen.com.d_factory_interface;

import colorchen.com.d_factory_interface.base.Pizza;
import colorchen.com.d_factory_interface.base.PizzaIngredientFactory;
import colorchen.com.d_factory_interface.base.PizzaStore;

/**
 * Created by color on 16/6/14 11:44.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("纽约风味cheese");
        }else if (type.equals("veggie")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("纽约风格的clam");
        }
        // TODO: 16/6/14  
        return pizza;
    }
}
