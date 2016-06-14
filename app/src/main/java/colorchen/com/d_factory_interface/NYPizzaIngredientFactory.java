package colorchen.com.d_factory_interface;

import colorchen.com.d_factory_interface.base.PizzaIngredientFactory;
import colorchen.com.d_factory_interface.bean.FreshClams;
import colorchen.com.d_factory_interface.bean.Garlic;
import colorchen.com.d_factory_interface.bean.MarinaraSauce;
import colorchen.com.d_factory_interface.bean.Mushroom;
import colorchen.com.d_factory_interface.bean.Onlion;
import colorchen.com.d_factory_interface.bean.RedPepper;
import colorchen.com.d_factory_interface.bean.ReggianoCheese;
import colorchen.com.d_factory_interface.bean.SlicedPeopperoni;
import colorchen.com.d_factory_interface.bean.ThinCrustDough;
import colorchen.com.d_factory_interface.bean.base.Cheese;
import colorchen.com.d_factory_interface.bean.base.Clams;
import colorchen.com.d_factory_interface.bean.base.Dough;
import colorchen.com.d_factory_interface.bean.base.Pepperoni;
import colorchen.com.d_factory_interface.bean.base.Sauce;
import colorchen.com.d_factory_interface.bean.base.Veggie;

/**
 * 创建纽约原料工厂的实现
 * Created by color on 16/6/13 20:08.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {

        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie veggie[] = {new Garlic(), new Onlion(), new Mushroom(), new RedPepper()};
        return veggie;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPeopperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
