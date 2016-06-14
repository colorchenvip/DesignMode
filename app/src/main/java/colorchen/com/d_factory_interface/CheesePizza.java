package colorchen.com.d_factory_interface;

import colorchen.com.d_factory_interface.base.Pizza;
import colorchen.com.d_factory_interface.base.PizzaIngredientFactory;

/**
 * Created by color on 16/6/14 11:33.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("准备"+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }


}
