package colorchen.com.c_decorator;

import colorchen.com.c_decorator.base.Beverage;

/**
 * 综合咖啡 饮料的实现类
 * Created by color on 16/6/13 15:05.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 1.40;
    }
}
