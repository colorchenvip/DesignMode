package colorchen.com.c_decorator;

import colorchen.com.c_decorator.base.Beverage;

/**
 * 烘焙咖啡 饮料的实现类
 * Created by color on 16/6/13 15:08.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
