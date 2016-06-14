package colorchen.com.c_decorator.base;

/**
 * 饮料抽象类
 * Created by color on 16/6/13 14:49.
 */
public abstract class Beverage {
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
