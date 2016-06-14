package colorchen.com.d_factory_interface.base;

import colorchen.com.d_factory_interface.bean.base.Cheese;
import colorchen.com.d_factory_interface.bean.base.Clams;
import colorchen.com.d_factory_interface.bean.base.Dough;
import colorchen.com.d_factory_interface.bean.base.Pepperoni;
import colorchen.com.d_factory_interface.bean.base.Sauce;
import colorchen.com.d_factory_interface.bean.base.Veggie;

/**
 * 工厂定义了一个接口--用来创建所有的原料
 * Created by color on 16/6/13 19:55.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggie[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
