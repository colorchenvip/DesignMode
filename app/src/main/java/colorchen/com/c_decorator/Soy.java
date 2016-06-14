package colorchen.com.c_decorator;

import colorchen.com.c_decorator.base.Beverage;
import colorchen.com.c_decorator.base.CondimentDecorator;

/**
 * 豆浆  调料的是实现类
 * Created by color on 16/6/13 15:31.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Soy";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
