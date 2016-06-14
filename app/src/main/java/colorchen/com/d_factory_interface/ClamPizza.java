package colorchen.com.d_factory_interface;

import colorchen.com.d_factory_interface.base.Pizza;
import colorchen.com.d_factory_interface.base.PizzaIngredientFactory;

/**
 * Created by color on 16/6/14 11:41.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("准备"+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
         clams = ingredientFactory.createClam();
    }

    @Override
    public void bake() {
        System.out.println("只需要4--5分钟就好哦");
    }

    @Override
    public void cut() {
        System.out.println("可以整体包装,不切哦");
    }

    @Override
    public void box() {
        System.out.println("今天特惠,免费送高级包装");
    }
}
