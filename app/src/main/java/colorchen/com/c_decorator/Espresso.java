package colorchen.com.c_decorator;

import colorchen.com.c_decorator.base.Beverage;

/**
 * 浓缩咖啡 饮料的实现类
 * Created by color on 16/6/13 14:58.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
