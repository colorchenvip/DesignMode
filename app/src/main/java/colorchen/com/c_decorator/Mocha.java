package colorchen.com.c_decorator;

import colorchen.com.c_decorator.base.Beverage;
import colorchen.com.c_decorator.base.CondimentDecorator;

/**
 * Mocha  是一种饮料 也是一种混合型咖啡
 * Created by color on 16/6/13 15:14.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return 0.30 + beverage.cost();
    }
}
