package colorchen.com.c_decorator;

import colorchen.com.c_decorator.base.Beverage;
import colorchen.com.c_decorator.base.CondimentDecorator;

/**
 * Created by color on 16/6/13 15:40.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
